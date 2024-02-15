package com.example.microserviciohospital.service.impl;

import com.example.microserviciohospital.model.Condicion;
import com.example.microserviciohospital.repository.CondicionRepository;
import com.example.microserviciohospital.service.CondicionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CondicionServiceImpl implements CondicionService {

    @Autowired
    CondicionRepository repo;

    @Override
    public List<Condicion> listar() {
        return repo.findAll();
    }

    @Override
    public Condicion registrar(Condicion condicion) {
        return repo.save(condicion);
    }

    @Override
    public Condicion actualizar(Condicion condicion) {
        return repo.save(condicion);
    }

    @Override
    public void eliminar(Long codigo) {
        repo.deleteById(codigo);
    }

    @Override
    public Condicion listarPorId(Long codigo) {
        return repo.findById(codigo).orElse(null);
    }
}
