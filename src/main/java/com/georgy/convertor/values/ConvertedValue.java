/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.georgy.convertor.values;

/**
 *
 * @author gorgigeorgievski
 */
public class ConvertedValue {

    Double amount;
    String currency;

    public Double getAmount() {
        return amount;
    }

    private void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    private void setCurrency(String currency) {
        this.currency = currency;
    }
    
    public static class Builder {
        Double amount;
        String currency;
        
        public Builder setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        
        public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        
        public ConvertedValue build() {
            ConvertedValue cv = new ConvertedValue();
            cv.setAmount(this.amount);
            cv.setCurrency(this.currency);
            return cv;
        }
    }
}
