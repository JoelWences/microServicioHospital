package com.example.microserviciohospital.service.impl;

import com.example.microserviciohospital.model.Distrito;
import com.example.microserviciohospital.repository.DistritoRepository;
import com.example.microserviciohospital.service.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistritoServiceImpl implements DistritoService {

    @Autowired
    DistritoRepository repo;

    @Override
    public List<Distrito> listar() {
        return repo.findAll();
    }

    @Override
    public Distrito registrar(Distrito distrito) {
        return repo.save(distrito);
    }

    @Override
    public Distrito actualizar(Distrito distrito) {
        return repo.save(distrito);
    }

    @Override
    public void eliminar(Long codigo) {
        repo.deleteById(codigo);
    }

    @Override
    public Distrito listarPorId(Long codigo) {
        return repo.findById(codigo).orElse(null);
    }

}
