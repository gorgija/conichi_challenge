/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.georgy.convertor.service;

import com.georgy.convertor.dto.CurrencyLayerDto;
import com.georgy.convertor.dto.ExcahgerLayerDto;
import com.georgy.convertor.values.ConvertedValue;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author gorgigeorgievski
 */
@Service
public class ConvertorService {

    @Value("${access_key}")
    String apiKey;
    
    @Value("${currency_url}")
    String currencyApiUrl;
    
    
    public HashMap<String,Double> getAllowedExchangeValutes() {
        ExcahgerLayerDto eld = new RestTemplate().getForObject(currencyApiUrl+"latest", ExcahgerLayerDto.class);
        eld.getRates().put("EUR", Double.NaN);
        return eld.getRates();
    }
    
    public ExcahgerLayerDto getLatestExchangeValues(String source) {
        String currencyUrl = currencyApiUrl + "latest?base=" + source ;
        return new RestTemplate().getForObject(currencyUrl,ExcahgerLayerDto.class);
    }
    
    public ExcahgerLayerDto getLatestSpecificExchangeValue(String source,String target) {
        String currencyUrl = currencyApiUrl + "latest?base=" + source + "&symbols=" + target ;
        return new RestTemplate().getForObject(currencyUrl,ExcahgerLayerDto.class);
    }
    
    public ConvertedValue convertValuteAmount(String amount , String source , String target) {
        ExcahgerLayerDto rateForExchangeAmmount = getLatestSpecificExchangeValue(source, target);
        System.out.println("AMOUNT: " + Double.valueOf(amount) + " TARGET: " + target);
        System.out.println("RATES: " + rateForExchangeAmmount.getRates());
        double resultAmmount = Double.valueOf(amount) * rateForExchangeAmmount.getRates().get(target);
        return new ConvertedValue.Builder().setAmount(resultAmmount).setCurrency(target).build();
    }
    
}
