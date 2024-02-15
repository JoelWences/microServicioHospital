package com.example.microserviciohospital.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "gerente")
public class Gerente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGerente;

    @Column(name = "descGerente")
    private String descGerente;

    @Column(name = "fechaRegistro")
    private Date fechaRegistro;

    public Long getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(Long idGerente) {
        this.idGerente = idGerente;
    }

    public String getDescGerente() {
        return descGerente;
    }

    public void setDescGerente(String descGerente) {
        this.descGerente = descGerente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
