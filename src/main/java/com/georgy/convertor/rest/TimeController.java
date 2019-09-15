/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.georgy.convertor.rest;

import com.georgy.convertor.values.TimeValue;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author gorgigeorgievski
 */

@RestController
public class TimeController implements BaseController{

    @RequestMapping(method = RequestMethod.GET,value = "/time")
    public ResponseEntity<TimeValue> getTime() {
        return new ResponseEntity<>(new TimeValue.Builder().setTime(System.currentTimeMillis()).build(), HttpStatus.OK);
    }
    
}
