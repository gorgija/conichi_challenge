/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.georgy.convertor.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.georgy.convertor.values.VatDataValue;
import java.util.HashMap;

/**
 *
 * @author gorgigeorgievski
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ValidateVatLayerDto {

    String company_address;
    String company_name;
    String country_code;
    String query;
    Boolean success;
    Boolean valid;
    Boolean validFormat;
    String vat_number;

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Boolean getValidFormat() {
        return validFormat;
    }

    public void setValidFormat(Boolean validFormat) {
        this.validFormat = validFormat;
    }

    public String getVat_number() {
        return vat_number;
    }

    public void setVat_number(String vat_number) {
        this.vat_number = vat_number;
    }

    @Override
    public String toString() {
        return "ValidateVatLayerDto{" + "company_address=" + company_address + ", company_name=" + company_name + ", country_code=" + country_code + ", query=" + query + ", success=" + success + ", valid=" + valid + ", validFormat=" + validFormat + ", vat_number=" + vat_number + '}';
    }
    
    
    
}
