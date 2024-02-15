package com.example.microserviciohospital.service;

import com.example.microserviciohospital.model.Hospital;

import java.util.List;

public interface HospitalService {
    List<Hospital> listar();

    Hospital registrar(Hospital hospital);

    Hospital actualizar(Hospital hospital);

    void eliminar(Long codigo);

    Hospital listarPorId(Long codigo);
}
