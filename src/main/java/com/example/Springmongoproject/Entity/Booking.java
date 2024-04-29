package com.example.Springmongoproject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "booking")
public class Booking {

    @Id
    private String _id;
    private String purpose;
    private String description;
    private String startDate;
    private String startPlace;
    private String startTiming;
    private String destination;
    private String facultyId;
    private String returnDate;
    private String returnPlace;
    private String returnTiming;

    public Booking(String _id, String purpose, String description, String startDate, String startPlace, String startTiming, String destination, String facultyId, String returnDate, String returnPlace, String returnTiming) {
        this._id = _id;
        this.purpose = purpose;
        this.description = description;
        this.startDate = startDate;
        this.startPlace = startPlace;
        this.startTiming = startTiming;
        this.destination = destination;
        this.facultyId = facultyId;
        this.returnDate = returnDate;
        this.returnPlace = returnPlace;
        this.returnTiming = returnTiming;
    }

    public Booking() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getStartTiming() {
        return startTiming;
    }

    public void setStartTiming(String startTiming) {
        this.startTiming = startTiming;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturnPlace() {
        return returnPlace;
    }

    public void setReturnPlace(String returnPlace) {
        this.returnPlace = returnPlace;
    }

    public String getReturnTiming() {
        return returnTiming;
    }

    public void setReturnTiming(String returnTiming) {
        this.returnTiming = returnTiming;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "_id='" + _id + '\'' +
                ", purpose='" + purpose + '\'' +
                ", description='" + description + '\'' +
                ", startDate='" + startDate + '\'' +
                ", startPlace='" + startPlace + '\'' +
                ", startTiming='" + startTiming + '\'' +
                ", destination='" + destination + '\'' +
                ", facultyId='" + facultyId + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", returnPlace='" + returnPlace + '\'' +
                ", returnTiming='" + returnTiming + '\'' +
                '}';
    }

}
