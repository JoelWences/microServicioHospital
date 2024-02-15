package com.example.microserviciohospital.controller;

import com.example.microserviciohospital.model.Hospital;
import com.example.microserviciohospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("hospital")
public class HospitalController {
    @Autowired
    private HospitalService service;

    @GetMapping
    public ResponseEntity<List<Hospital>> listar(){
        List<Hospital> obj = service.listar();
        return new ResponseEntity<List<Hospital>>(obj, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Hospital> registrar(@RequestBody Hospital hospital){
        Hospital obj = service.registrar(hospital);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdHospital()).toUri();
        return ResponseEntity.created(uri).build();
    }


    @PutMapping
    public ResponseEntity<Hospital> actualizar( @RequestBody Hospital hospital){
        Hospital obj = service.actualizar(hospital);
        return new ResponseEntity<Hospital>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar( @PathVariable("id") Long id) throws Exception {
        Hospital obj = service.listarPorId(id);
        if(obj == null){
            throw new Exception("No se encontro ID");
        }
        service.eliminar(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Hospital> ListarPorId (@PathVariable("id") Long codigo) throws Exception {
        Hospital obj = service.listarPorId(codigo);
        if(obj == null){
            throw new Exception("No se encontro ID");
        }
        return new ResponseEntity<Hospital>(obj, HttpStatus.OK);
    }

}
