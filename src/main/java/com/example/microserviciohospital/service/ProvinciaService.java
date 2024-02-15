package com.example.microserviciohospital.service;

import com.example.microserviciohospital.model.Provincia;

import java.util.List;

public interface ProvinciaService {
    List<Provincia> listar();

    Provincia registrar(Provincia provincia);

    Provincia actualizar(Provincia provincia);

    void eliminar(Long codigo);

    Provincia listarPorId(Long codigo);
}
