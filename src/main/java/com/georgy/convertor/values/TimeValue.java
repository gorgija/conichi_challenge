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
public class TimeValue {

    long time;

    public long getTime() {
        return time;
    }

    private void setTime(long time) {
        this.time = time;
    }
    
    public static class Builder {
        long time;
        
        public Builder setTime(long time) {
            this.time = time;
            return this;
        }
        
        public TimeValue build() {
            TimeValue timeValue = new TimeValue();
            timeValue.setTime(this.time);
            return timeValue;
            
        }
    }
    
}
