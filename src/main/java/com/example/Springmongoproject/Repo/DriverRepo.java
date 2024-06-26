package com.example.Springmongoproject.Repo;

import com.example.Springmongoproject.Entity.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends MongoRepository<Driver, String> {
}
