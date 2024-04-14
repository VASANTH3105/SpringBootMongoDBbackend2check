package com.example.Springmongoproject.Service;

import com.example.Springmongoproject.Entity.Driver;
import com.example.Springmongoproject.Repo.DriverRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServices {

    @Autowired
    private DriverRepo repo;

    public void saveorUpdate(Driver drivers) {

        repo.save(drivers);
    }

    public Iterable<Driver> listAll() {
        return this.repo.findAll();
    }

    public void deleteDriver(String id) {
        repo.deleteById(id);
    }

    public Driver getDriverByID(String driverid) {
        return repo.findById(driverid).get();
    }
}
