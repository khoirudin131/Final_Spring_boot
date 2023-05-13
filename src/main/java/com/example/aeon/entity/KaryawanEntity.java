package com.example.aeon.entity;



import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@EntityListeners(EntityListeners.class)
@Table(name = "karyawan")
public class KaryawanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_karyawan")
    private Long id;

    @CreationTimestamp
    @Column(name = "created_date", nullable = false, updatable = false)
    private Date cretdate;

    @UpdateTimestamp
    @Column(name = "updated_date")
    private Date upddate;

    @Column(name = "alamat")
    private String address;

    @Column(name = "dob")
    private Date dateOfBirth;

    @Column(name = "jk")
    private String gender;

    @Column(name = "nama")
    private String name;

    @Column(name = "status")
    private String status;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_karyawan",referencedColumnName = "id_karyawan")
    private List<RekeningEntity> rekeningnentity;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_karyawan",referencedColumnName = "id_karyawan")
    private List<KaryawanTrainingEntity> karyawantrainingentity;


    public KaryawanEntity() {
    }

    public KaryawanEntity(Long id, Date cretdate, Date upddate, String address, Date dateOfBirth, String gender, String name, String status) {
        this.id = id;
        this.cretdate = cretdate;
        this.upddate = upddate;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.name = name;
        this.status = status;
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
