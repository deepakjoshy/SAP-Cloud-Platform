package com.example.demo1.controller;

import java.util.List;

import com.example.demo1.model.demo;
import com.example.demo1.repository.demorepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * democontroller
 */
@RestController
public class democontroller {

    Logger log = LoggerFactory.getLogger(getClass());
    

    @Autowired
    private demorepository obj;

    @GetMapping("")
    public String test(){
        return "Working";
    }

    @GetMapping("test")
    public String test1(){
        return "Working1";
    }

    @GetMapping("all")
    public List<demo> getAll(){
        return obj.findAll();
    }
    
    @PostMapping("add")
    public Boolean test (@RequestBody demo body){
       log.info("+++++++++++++++++++++++++");
       log.info("hi" + body);
       obj.save(body);
        
        return true;    
    }
}