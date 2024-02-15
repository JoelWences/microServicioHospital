package com.example.microserviciohospital.controller;


import com.example.microserviciohospital.model.Sede;
import com.example.microserviciohospital.service.SedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sede")
public class SedeController {

    @Autowired
    private SedeService service;

    @GetMapping
    public ResponseEntity<List<Sede>> listar(){
        List<Sede> obj = service.listar();
        return new ResponseEntity<List<Sede>>(obj, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Sede> registrar(@RequestBody Sede sede){
        Sede obj = service.registrar(sede);
        return new ResponseEntity<Sede>(obj, HttpStatus.OK);
    }


    @PutMapping
    public ResponseEntity<Sede> actualizar( @RequestBody Sede sede){
        Sede obj = service.actualizar(sede);
        return new ResponseEntity<Sede>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar( @PathVariable("id") Long id) throws Exception {
        Sede obj = service.listarPorId(id);
        if(obj == null){
            throw new Exception("No se encontro ID");
        }
        service.eliminar(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Sede> ListarPorId (@PathVariable("id") Long codigo) throws Exception {
        Sede obj = service.listarPorId(codigo);
        if(obj == null){
            throw new Exception("No se encontro ID");
        }
        return new ResponseEntity<Sede>(obj, HttpStatus.OK);
    }
}
