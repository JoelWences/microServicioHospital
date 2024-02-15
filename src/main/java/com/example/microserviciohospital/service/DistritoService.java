package com.example.microserviciohospital.service;

import com.example.microserviciohospital.model.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface DistritoService  {

    List<Distrito> listar();

    Distrito registrar(Distrito distrito);

    Distrito actualizar(Distrito distrito);

    void eliminar(Long codigo);

    Distrito listarPorId(Long codigo);



}
