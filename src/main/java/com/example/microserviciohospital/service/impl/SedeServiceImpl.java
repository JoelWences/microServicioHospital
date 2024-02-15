package com.example.microserviciohospital.service.impl;

import com.example.microserviciohospital.model.Sede;
import com.example.microserviciohospital.repository.SedeRepository;
import com.example.microserviciohospital.service.SedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SedeServiceImpl implements SedeService {

    @Autowired
    SedeRepository repo;


    @Override
    public List<Sede> listar() {
        return repo.findAll();
    }

    @Override
    public Sede registrar(Sede sede) {
        return repo.save(sede);
    }

    @Override
    public Sede actualizar(Sede sede) {
        return repo.save(sede);
    }

    @Override
    public void eliminar(Long codigo) {
        repo.deleteById(codigo);
    }

    @Override
    public Sede listarPorId(Long codigo) {
        return repo.findById(codigo).orElse(null);
    }
}
