package com.example.Springmongoproject.Repo;

import com.example.Springmongoproject.Entity.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepo extends MongoRepository<Vehicle, String> {
}
