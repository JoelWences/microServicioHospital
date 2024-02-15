package com.example.microserviciohospital.service.impl;

import com.example.microserviciohospital.model.Provincia;
import com.example.microserviciohospital.repository.ProvinciaRepository;
import com.example.microserviciohospital.service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {


    @Autowired
    ProvinciaRepository repo;

    @Override
    public List<Provincia> listar() {
        return repo.findAll();
    }

    @Override
    public Provincia registrar(Provincia provincia) {
        return repo.save(provincia);
    }

    @Override
    public Provincia actualizar(Provincia provincia) {
        return repo.save(provincia);
    }

    @Override
    public void eliminar(Long codigo) {
        repo.deleteById(codigo);
    }

    @Override
    public Provincia listarPorId(Long codigo) {
        return repo.findById(codigo).orElse(null);
    }
}
