package com.example.microserviciohospital.repository;

import com.example.microserviciohospital.model.Condicion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CondicionRepository extends JpaRepository<Condicion,Long> {
}
