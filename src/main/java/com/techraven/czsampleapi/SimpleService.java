package com.techraven.czsampleapi;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PrivateKey;
import java.util.List;

@RestController
public class SimpleService {

    private final RecordRepository repository;

    public SimpleService(RecordRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/")
    public String allRecords(){
        String s = "hello world";
        return s;
    }

    @GetMapping("/records")
    public List<RecordModel> getData(){

           return repository.findAll();
    }


}
