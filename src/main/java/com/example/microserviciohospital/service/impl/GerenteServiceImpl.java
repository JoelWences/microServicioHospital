package com.example.microserviciohospital.service.impl;

import com.example.microserviciohospital.model.Gerente;
import com.example.microserviciohospital.repository.GerenteRepository;
import com.example.microserviciohospital.service.GerenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerenteServiceImpl implements GerenteService {

    @Autowired
    GerenteRepository repo;

    @Override
    public List<Gerente> listar() {
        return repo.findAll();
    }

    @Override
    public Gerente registrar(Gerente gerente) {
        return repo.save(gerente);
    }

    @Override
    public Gerente actualizar(Gerente gerente) {
        return repo.save(gerente);
    }

    @Override
    public void eliminar(Long codigo) {
        repo.deleteById(codigo);
    }

    @Override
    public Gerente listarPorId(Long codigo) {
        return repo.findById(codigo).orElse(null);
    }
}
