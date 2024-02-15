package com.example.microserviciohospital.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "condicion")
public class Condicion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCondicion;

    @Column(name = "descCondicion")
    private String descCondicion;

    @Column(name = "fechaRegistro")
    private Date fechaRegistro;

    public Long getIdCondicion() {
        return idCondicion;
    }

    public void setIdCondicion(Long idCondicion) {
        this.idCondicion = idCondicion;
    }

    public String getDescCondicion() {
        return descCondicion;
    }

    public void setDescCondicion(String descCondicion) {
        this.descCondicion = descCondicion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
