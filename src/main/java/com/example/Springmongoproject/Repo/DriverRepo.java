package com.example.Springmongoproject.Repo;

import com.example.Springmongoproject.Entity.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DriverRepo extends MongoRepository<Driver, String> {
}
