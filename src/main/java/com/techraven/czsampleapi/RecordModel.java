package com.techraven.czsampleapi;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("data")
public class RecordModel {

    private String id, name, notes;
    // id,

    private int age;

   /* public RecordModel(int age, String name, String notes){
        super();
    }*/

    public RecordModel(String id, String name, String notes, int age) {
        super();
        this.id = id;
        this.name = name;
        this.notes = notes;
        this.age = age;
    }

    @Override
    public String toString() {
        return "RecordModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", notes='" + notes + '\'' +
                ", age=" + age +
                '}';
    }
}
