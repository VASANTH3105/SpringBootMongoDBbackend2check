package com.example.Springmongoproject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "drivermaster")
public class Driver {

    @Id
    private String _id;
    private String staffId;
    private String name;
    private String licenseNo;
    private String licenseType;
    private String expDate;
    private String address;
    private String mobileNo;

    public Driver(String _id, String staffId, String name, String licenseNo, String licenseType, String expDate, String address, String mobileNo) {
        this._id = _id;
        this.staffId = staffId;
        this.name = name;
        this.licenseNo = licenseNo;
        this.licenseType = licenseType;
        this.expDate = expDate;
        this.address = address;
        this.mobileNo = mobileNo;
    }

    public Driver() {
    }

    public String get_id() {
        return _id;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public String getExpDate() {
        return expDate;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "_id='" + _id + '\'' +
                ", staffId='" + staffId + '\'' +
                ", name='" + name + '\'' +
                ", licenseNo='" + licenseNo + '\'' +
                ", licenseType='" + licenseType + '\'' +
                ", expDate='" + expDate + '\'' +
                ", address='" + address + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }
}
