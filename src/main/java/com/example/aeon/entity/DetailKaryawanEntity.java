package com.example.aeon.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@EntityListeners(EntityListeners.class)
@Table(name = "detail_karyawan")
public class DetailKaryawanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detail_karyawan")
    private Long id;

    @Column(name = "nik")
    private String nik;

    @Column(name = "npwp")
    private String npwp;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_karyawan")
    private KaryawanEntity karyawanentity;

    public DetailKaryawanEntity() {
    }

    public DetailKaryawanEntity(Long id, String nik, String npwp) {
        this.id = id;
        this.nik = nik;
        this.npwp = npwp;
    }

    public KaryawanEntity getKaryawanentity() {
        return karyawanentity;
    }

    public void setKaryawanentity(KaryawanEntity karyawanentity) {
        this.karyawanentity = karyawanentity;
    }

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
}
