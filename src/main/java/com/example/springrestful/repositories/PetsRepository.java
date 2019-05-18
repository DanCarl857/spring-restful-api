package com.example.springrestful.repositories;

import com.example.springrestful.models.Pets;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetsRepository extends MongoRepository<Pets, String> {

    Pets findBy_id(ObjectId _id);
}
