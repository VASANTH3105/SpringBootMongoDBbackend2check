package com.example.Springmongoproject.Service;

import com.example.Springmongoproject.Entity.Vehicle;
import com.example.Springmongoproject.Repo.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServices {

    
    @Autowired
    private VehicleRepo repo;

    public void saveorUpdate(Vehicle vehicles) {
        repo.save(vehicles);
    }

    public Iterable<Vehicle> listAll() {
        return this.repo.findAll();
    }

    public void deleteVehicle(String id) {
        repo.deleteById(id);
    }

    public Vehicle getVehicleID(String vehicleid) {
        return repo.findById(vehicleid).get();
    }
}
