/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.georgy.convertor.rest;

import com.georgy.convertor.dto.CurrencyLayerDto;
import com.georgy.convertor.service.ConvertorService;
import com.georgy.convertor.values.ConvertedValue;
import com.georgy.convertor.values.TimeValue;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author gorgigeorgievski
 */
@RestController
public class ConvertorController implements BaseController{

    
    @Autowired
    ConvertorService convertorService;
    

    
    
    @RequestMapping(value = "/currency/converter",method = RequestMethod.GET)
    public ResponseEntity<ConvertedValue> convertCurrency(
                                                   @RequestParam(required = true,name = "amount") String amount , 
                                                   @RequestParam(required = true,name = "source") String sourceCurrency ,
                                                   @RequestParam(required = true,name = "target") String targetCurrency) {
        HashMap<String, Double> allowedExchangeValutes = convertorService.getAllowedExchangeValutes();
        if(!allowedExchangeValutes.containsKey(sourceCurrency) || !allowedExchangeValutes.containsKey(targetCurrency))
        {
            System.out.println("BAD REQUEST = NOT SUPORTED VALUTE!");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        ConvertedValue convertValuteAmount = convertorService.convertValuteAmount(amount, sourceCurrency, targetCurrency);
        return new ResponseEntity<>(convertValuteAmount,HttpStatus.OK);
    }
    
    @RequestMapping(value = "/currency/all",method = RequestMethod.GET)
    public ResponseEntity<HashMap<String,Double>> validCurrency() {
        HashMap<String, Double> allowedExchangeValutes = convertorService.getAllowedExchangeValutes();
        return new ResponseEntity<>(allowedExchangeValutes,HttpStatus.OK);
    }
    
}
