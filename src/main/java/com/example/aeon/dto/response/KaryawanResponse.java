package com.example.aeon.dto.response;

import com.example.aeon.entity.KaryawanTrainingEntity;
import com.example.aeon.entity.RekeningEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class KaryawanResponse implements Serializable {
    private Long id;
    private Date cretdate;
    private Date upddate;
    private String address;
    private Date dateOfBirth;
    private String gender;
    private String name;
    private String status;


    public KaryawanResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCretdate() {
        return cretdate;
    }

    public void setCretdate(Date cretdate) {
        this.cretdate = cretdate;
    }

    public Date getUpddate() {
        return upddate;
    }

    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
