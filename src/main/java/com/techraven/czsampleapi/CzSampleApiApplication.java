package com.techraven.czsampleapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class CzSampleApiApplication {



    public static void main(String[] args) {
        SpringApplication.run(CzSampleApiApplication.class, args);
    }

}
