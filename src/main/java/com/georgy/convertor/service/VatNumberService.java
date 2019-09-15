/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.georgy.convertor.service;

import com.georgy.convertor.dto.ExcahgerLayerDto;
import com.georgy.convertor.dto.ValidateVatLayerDto;
import com.georgy.convertor.values.VatDataValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author gorgigeorgievski
 */
@Service
public class VatNumberService {

    @Value("${validation.access_key}")
    String apiKey;

    @Value("${vat_url}")
    String currencyApiUrl;

    public ValidateVatLayerDto validateVatNumber(String vatNumber) {
        String validateVatUrl = currencyApiUrl + "validate?vat=" + vatNumber + "&key=" + apiKey;
        RestTemplate rest = new RestTemplate();
        ValidateVatLayerDto testVat = rest.getForObject(validateVatUrl, ValidateVatLayerDto.class);
        System.out.println("TEST VAT: " + testVat);
        return testVat;

    }

    public VatDataValue getValidVatNumberCountryCode(String vatNumber) {
        ValidateVatLayerDto validateVatNumber = validateVatNumber(vatNumber);
        return new VatDataValue.Builder()
          .setCode(validateVatNumber.getCountry_code())
          .setValid(validateVatNumber.getValid())
          .build();
    }

}
