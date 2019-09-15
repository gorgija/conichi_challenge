/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.georgy.convertor.dto;

import java.util.HashMap;

/**
 *
 * @author gorgigeorgievski
 */
public class ExcahgerLayerDto {

    HashMap<String, Double> rates;
    String base;
    String date;

    public HashMap<String, Double> getRates() {
        return rates;
    }

    public void setRates(HashMap<String, Double> rates) {
        this.rates = rates;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ExcahgerLayerDto{" + "rates=" + rates + ", base=" + base + ", date=" + date + '}';
    }
    
    
    
}
