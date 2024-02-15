package com.example.microserviciohospital.service;

import com.example.microserviciohospital.model.Gerente;

import java.util.List;

public interface GerenteService {

    List<Gerente> listar();

    Gerente registrar(Gerente gerente);

    Gerente actualizar(Gerente gerente);

    void eliminar(Long codigo);

    Gerente listarPorId(Long codigo);

}
