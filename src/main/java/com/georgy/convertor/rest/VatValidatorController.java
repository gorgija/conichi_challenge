/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.georgy.convertor.rest;

import com.georgy.convertor.dto.ValidateVatLayerDto;
import com.georgy.convertor.service.VatNumberService;
import com.georgy.convertor.values.VatDataValue;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author gorgigeorgievski
 */
@RestController
public class VatValidatorController implements BaseController {

    @Autowired
    VatNumberService vatService;

    @RequestMapping(value = "/validate/{vatnumber}")
    public ResponseEntity<VatDataValue> validateVat(@PathVariable(value = "vatnumber",required = true) String vatNumber) {
        VatDataValue validVatNumberCountryCode = vatService.getValidVatNumberCountryCode(vatNumber);
        return new ResponseEntity<>(validVatNumberCountryCode,HttpStatus.OK);
    }
    
}
