package com.example.microserviciohospital.repository;

import com.example.microserviciohospital.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository <Hospital,Long> {
}
