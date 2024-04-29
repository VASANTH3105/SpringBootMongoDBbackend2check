package com.example.Springmongoproject.Repo;

import com.example.Springmongoproject.Entity.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends MongoRepository<Booking, String> {
}
