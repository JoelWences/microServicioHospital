package com.example.microserviciohospital.controller;

import com.example.microserviciohospital.model.Gerente;
import com.example.microserviciohospital.service.GerenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gerente")
public class GerenteController {

    @Autowired
    private GerenteService service;

    @GetMapping
    public ResponseEntity<List<Gerente>> listar(){
        List<Gerente> obj = service.listar();
        return new ResponseEntity<List<Gerente>>(obj, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Gerente> registrar(@RequestBody Gerente gerente){
        Gerente obj = service.registrar(gerente);
        return new ResponseEntity<Gerente>(obj, HttpStatus.OK);
    }


    @PutMapping
    public ResponseEntity<Gerente> actualizar( @RequestBody Gerente gerente){
        Gerente obj = service.actualizar(gerente);
        return new ResponseEntity<Gerente>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar( @PathVariable("id") Long id) throws Exception {
        Gerente obj = service.listarPorId(id);
        if(obj == null){
            throw new Exception("No se encontro ID");
        }
        service.eliminar(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Gerente> ListarPorId (@PathVariable("id") Long codigo) throws Exception {
        Gerente obj = service.listarPorId(codigo);
        if(obj == null){
            throw new Exception("No se encontro ID");
        }
        return new ResponseEntity<Gerente>(obj, HttpStatus.OK);
    }

}
