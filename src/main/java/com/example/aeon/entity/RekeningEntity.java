package com.example.aeon.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "rekening")
public class RekeningEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rekening")
    private long id;

    @CreationTimestamp
    @Column(name = "created_date", nullable = false, updatable = false)
    private Date cretdate;

    @UpdateTimestamp
    @Column(name = "updated_date")
    private Date upddate;

    @Column(name = "jenis")
    private String jenis;

    @Column(name = "nama")
    private String nama;

    @Column(name = "nomor")
    private String nomor;


    public RekeningEntity() {
    }

    public RekeningEntity(long id, Date cretdate, Date upddate, String jenis, String nama, String nomor) {
        this.id = id;
        this.cretdate = cretdate;
        this.upddate = upddate;
        this.jenis = jenis;
        this.nama = nama;
        this.nomor = nomor;
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

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
}
