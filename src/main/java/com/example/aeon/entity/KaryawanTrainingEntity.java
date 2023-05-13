package com.example.aeon.entity;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "karyawan_training")
public class KaryawanTrainingEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_karyawan_training")
    private long id;

    @CreationTimestamp
    @Column(name = "created_date", nullable = false, updatable = false)
    private Date cretdate;

    @UpdateTimestamp
    @Column(name = "updated_date")
    private Date upddate;

    @Column(name = "tanggal_training")
    private Date tgltrning;

    public KaryawanTrainingEntity() {
    }

    public KaryawanTrainingEntity(long id, Date cretdate, Date upddate, Date tgltrning) {
        this.id = id;
        this.cretdate = cretdate;
        this.upddate = upddate;
        this.tgltrning = tgltrning;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Date getTgltrning() {
        return tgltrning;
    }

    public void setTgltrning(Date tgltrning) {
        this.tgltrning = tgltrning;
    }
}

