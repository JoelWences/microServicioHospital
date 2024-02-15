package com.example.microserviciohospital.controller;

import com.example.microserviciohospital.model.Condicion;
import com.example.microserviciohospital.service.CondicionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("condicion")
public class CondicionController {

    @Autowired
    private CondicionService service;

    @GetMapping
    public ResponseEntity<List<Condicion>> listar(){
        List<Condicion> obj = service.listar();
        return new ResponseEntity<List<Condicion>>(obj, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Condicion> registrar(@RequestBody Condicion condicion){
        Condicion obj = service.registrar(condicion);
        return new ResponseEntity<Condicion>(obj, HttpStatus.OK);
    }


    @PutMapping
    public ResponseEntity<Condicion> actualizar( @RequestBody Condicion condicion){
        Condicion obj = service.actualizar(condicion);
        return new ResponseEntity<Condicion>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar( @PathVariable("id") Long id) throws Exception {
        Condicion obj = service.listarPorId(id);
        if(obj == null){
            throw new Exception("No se encontro ID");
        }
        service.eliminar(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Condicion> ListarPorId (@PathVariable("id") Long codigo) throws Exception {
        Condicion obj = service.listarPorId(codigo);
        if(obj == null){
            throw new Exception("No se encontro ID");
        }
        return new ResponseEntity<Condicion>(obj, HttpStatus.OK);
    }
}
