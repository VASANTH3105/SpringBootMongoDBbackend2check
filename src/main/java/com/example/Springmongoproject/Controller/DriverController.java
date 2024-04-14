package com.example.Springmongoproject.Controller;

import com.example.Springmongoproject.Entity.Driver;
import com.example.Springmongoproject.Service.DriverServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/drivermaster")
public class DriverController {

    @Autowired
    private DriverServices driverServices;

    @PostMapping(value = "/save")
    public String saveDriver(@RequestBody Driver driver) {
        driverServices.saveorUpdate(driver);
        return driver.get_id();
    }

    @GetMapping(value = "/getall")
    public Iterable<Driver> getDrivers() { return driverServices.listAll(); }

    @PostMapping(value = "/edit/{id}")
    private Driver update(@RequestBody Driver driver, @PathVariable(name = "id") String _id) {
        driver.set_id(_id);
        driverServices.saveorUpdate(driver);
        return driver;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteDriver(@PathVariable("id")String _id) {
        driverServices.deleteDriver(_id);

    }

    @RequestMapping("/search/{id}")
    private Driver getSriver(@PathVariable(name = "id")String driverid) {
        return driverServices.getDriverByID(driverid);
    }
}
