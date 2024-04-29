package com.example.Springmongoproject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "drivermaster")
public class Driver {

    @Id
    private String _id;
    private String staffid;
    private String name;
    private String licenseno;
    private String licensetype;
    private String expdate;
    private String address;
    private String mobileno;


    public Driver(String _id, String staffid, String name, String licenseno, String licensetype, String expdate, String address, String mobileno) {
        this._id = _id;
        this.staffid = staffid;
        this.name = name;
        this.licenseno = licenseno;
        this.licensetype = licensetype;
        this.expdate = expdate;
        this.address = address;
        this.mobileno = mobileno;
    }

    public Driver() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseno() {
        return licenseno;
    }

    public void setLicenseno(String licenseno) {
        this.licenseno = licenseno;
    }

    public String getLicensetype() {
        return licensetype;
    }

    public void setLicensetype(String licensetype) {
        this.licensetype = licensetype;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "_id='" + _id + '\'' +
                ", staffid='" + staffid + '\'' +
                ", name='" + name + '\'' +
                ", licenseno='" + licenseno + '\'' +
                ", licensetype='" + licensetype + '\'' +
                ", expdate='" + expdate + '\'' +
                ", address='" + address + '\'' +
                ", mobileno='" + mobileno + '\'' +
                '}';
    }
}
