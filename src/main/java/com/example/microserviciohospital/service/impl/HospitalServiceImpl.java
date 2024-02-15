package com.example.microserviciohospital.service.impl;

import com.example.microserviciohospital.model.Hospital;
import com.example.microserviciohospital.repository.HospitalRepository;
import com.example.microserviciohospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    HospitalRepository repo;

    @Override
    public List<Hospital> listar() {
        return repo.findAll();
    }

    @Override
    public Hospital registrar(Hospital hospital) {
        return repo.save(hospital);
    }

    @Override
    public Hospital actualizar(Hospital hospital) {
        return repo.save(hospital);
    }

    @Override
    public void eliminar(Long codigo) {
        repo.deleteById(codigo);
    }

    @Override
    public Hospital listarPorId(Long codigo) {
        return repo.findById(codigo).orElse(null);
    }
}
