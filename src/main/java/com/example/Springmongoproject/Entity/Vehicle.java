package com.example.Springmongoproject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vehiclemaster")
public class Vehicle {

    @Id
    private String _id;
    private String vehiclename;
    private String vehicleno;
    private String registrationdate;
    private String fcfitnesscertificate;
    private String roadtax;
    private String insurance;
    private String pollutiontest;

    public Vehicle(String _id, String vehiclename, String vehicleno, String registrationdate, String fcfitnesscertificate, String roadtax, String insurance, String pollutiontest) {
        this._id = _id;
        this.vehiclename = vehiclename;
        this.vehicleno = vehicleno;
        this.registrationdate = registrationdate;
        this.fcfitnesscertificate = fcfitnesscertificate;
        this.roadtax = roadtax;
        this.insurance = insurance;
        this.pollutiontest = pollutiontest;
    }

    public Vehicle() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getVehiclename() {
        return vehiclename;
    }

    public void setVehiclename(String vehiclename) {
        this.vehiclename = vehiclename;
    }

    public String getVehicleno() {
        return vehicleno;
    }

    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }

    public String getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(String registrationdate) {
        this.registrationdate = registrationdate;
    }

    public String getFcfitnesscertificate() {
        return fcfitnesscertificate;
    }

    public void setFcfitnesscertificate(String fcfitnesscertificate) {
        this.fcfitnesscertificate = fcfitnesscertificate;
    }

    public String getRoadtax() {
        return roadtax;
    }

    public void setRoadtax(String roadtax) {
        this.roadtax = roadtax;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getPollutiontest() {
        return pollutiontest;
    }

    public void setPollutiontest(String pollutiontest) {
        this.pollutiontest = pollutiontest;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "_id='" + _id + '\'' +
                ", vehiclename='" + vehiclename + '\'' +
                ", vehicleno='" + vehicleno + '\'' +
                ", registrationdate='" + registrationdate + '\'' +
                ", fcfitnesscertificate='" + fcfitnesscertificate + '\'' +
                ", roadtax='" + roadtax + '\'' +
                ", insurance='" + insurance + '\'' +
                ", pollutiontest='" + pollutiontest + '\'' +
                '}';
    }
}
