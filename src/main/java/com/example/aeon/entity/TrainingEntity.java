package com.example.aeon.entity;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "training")
public class TrainingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_training")
    private long id;

    @CreationTimestamp
    @Column(name = "created_date", nullable = false, updatable = false)
    private Date cretdate;

    @UpdateTimestamp
    @Column(name = "updated_date")
    private Date upddate;

    @Column(name = "nama_pengajar")
    private String namepngjar;

    @Column(name = "tema")
    private String tema;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_training",referencedColumnName = "id_training")
    private List<KaryawanTrainingEntity> karyawantrainingentity;

    public TrainingEntity() {
    }

    public TrainingEntity(long id, Date cretdate, Date upddate, String namepngjar, String tema) {
        this.id = id;
        this.cretdate = cretdate;
        this.upddate = upddate;
        this.namepngjar = namepngjar;
        this.tema = tema;
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

    public String getNamepngjar() {
        return namepngjar;
    }

    public void setNamepngjar(String namepngjar) {
        this.namepngjar = namepngjar;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}