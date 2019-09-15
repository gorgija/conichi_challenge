/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.georgy.convertor.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.net.URL;
import java.util.HashMap;

/**
 *
 * @author gorgigeorgievski
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyLayerDto {

    Boolean success;
    String terms;
    String privacy;
    long timestamp;
    String source;
    HashMap<String, Double> quotes;
    
    

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public HashMap<String, Double> getQuotes() {
        return quotes;
    }

    public void setQuotes(HashMap<String, Double> quotes) {
        this.quotes = quotes;
    }
    
    
    

    @Override
    public String toString() {
        return "CurrencyLayer{" + "success=" + success + ", terms=" + terms + ", privacy=" + privacy + ", timestamp=" + timestamp + ", source=" + source + ", quotes=" + quotes + '}';
    }
    
    
    
}
