/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.georgy.convertor.values;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.HashMap;

/**
 *
 * @author gorgigeorgievski
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VatDataValue {

    Boolean valid;
    String countryCode;

    public Boolean getValid() {
        return valid;
    }

    private void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getCountryCode() {
        return countryCode;
    }

    private void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "VatDataValue{" + "valid=" + valid + ", company=" + countryCode + '}';
    }

    public static class Builder {
    
        Boolean valid;
        String countryCode;
        
        public Builder setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        
        public Builder setCode(String code) {
            this.countryCode = code;
            return this;
        }
        
        public VatDataValue build() {
            VatDataValue vdv = new VatDataValue();
            vdv.setCountryCode(this.countryCode);
            vdv.setValid(this.valid);
            return vdv;
        }
    }
    
    
}
