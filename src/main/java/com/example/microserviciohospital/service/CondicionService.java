package com.example.microserviciohospital.service;

import com.example.microserviciohospital.model.Condicion;


import java.util.List;

public interface CondicionService {

    List<Condicion> listar();

    Condicion registrar(Condicion condicion);

    Condicion actualizar(Condicion condicion);

    void eliminar(Long codigo);

    Condicion listarPorId(Long codigo);
}
