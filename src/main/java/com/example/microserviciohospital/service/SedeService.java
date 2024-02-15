package com.example.microserviciohospital.service;

import com.example.microserviciohospital.model.Sede;

import java.util.List;

public interface SedeService {

    List<Sede> listar();

    Sede registrar(Sede sede);

    Sede actualizar(Sede sede);

    void eliminar(Long codigo);

    Sede listarPorId(Long codigo);

}
