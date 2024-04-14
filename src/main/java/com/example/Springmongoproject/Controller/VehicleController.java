package com.example.Springmongoproject.Controller;

import com.example.Springmongoproject.Entity.Student;
import com.example.Springmongoproject.Entity.Vehicle;
import com.example.Springmongoproject.Service.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/vehicle")
public class VehicleController {

    @Autowired
    private VehicleServices vehicleServices;

    @PostMapping(value = "/save")
    public String saveVehicle(@RequestBody Vehicle vehicles) {
        vehicleServices.saveorUpdate(vehicles);
        return vehicles.get_id();
    }
    @GetMapping(value = "/getall")
    public Iterable<Vehicle> getStudent() { return  vehicleServices.listAll(); }

    @PutMapping(value = "/edit/{id}")
    public Vehicle update(@RequestBody Vehicle vehicle, @PathVariable(name = "id") String _id) {
        vehicle.set_id(_id);
        vehicleServices.saveorUpdate(vehicle);
        return vehicle;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteVehicle(@PathVariable("id") String _id) {
        vehicleServices.deleteVehicle(_id);
    }

    @RequestMapping("/search/{id}")
    private Vehicle getVehicle(@PathVariable(name = "id") String vehicleid) {
        return vehicleServices.getVehicleID(vehicleid);
    }


}
