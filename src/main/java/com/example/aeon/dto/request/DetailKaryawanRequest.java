package com.example.aeon.dto.request;

import java.io.Serializable;
import java.util.Date;

public class DetailKaryawanRequest implements Serializable {

    private Long id;
    private String nik;
    private String npwp;
    private Long karyawanentity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public Long getKaryawanentity() {
        return karyawanentity;
    }

    public void setKaryawanentity(Long karyawanentity) {
        this.karyawanentity = karyawanentity;
    }
}
