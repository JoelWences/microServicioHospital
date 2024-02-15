package com.example.microserviciohospital.model;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

@Entity
@Table(name = "hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHospital;

    @ManyToOne
    @JoinColumn(name = "idDistrito")
    private Distrito distrito;

    @Column(name = "nombre")
    private String nombre;

    @Column (name = "antiguedad")
    private Long antiguedad;

    @Column (name = "area")
    private BigDecimal area;

    @ManyToOne
    @JoinColumn(name = "idSede")
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "idGerente")
    private Gerente gerente;

    @ManyToOne
    @JoinColumn(name = "idCondicion")
    private Condicion condicion;

    @Column(name = "fechaRegistro")
    private Date fechaRegistro;

    public Long getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(Long idHospital) {
        this.idHospital = idHospital;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Long antiguedad) {
        this.antiguedad = antiguedad;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
