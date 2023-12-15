package com.techraven.czsampleapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecordRepository extends MongoRepository<RecordModel,String>
{

}
