package com.techraven.czsampleapi;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("data")
public class RecordModel {

    @Id
    private String id, name, notes;

    private int age;

    public RecordModel(String id, int age, String name, String notes){
        super();
        this.id = id;
    }

}
