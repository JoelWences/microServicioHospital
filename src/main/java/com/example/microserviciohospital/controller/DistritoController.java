package com.example.microserviciohospital.controller;

import com.example.microserviciohospital.model.Distrito;
import com.example.microserviciohospital.model.Provincia;
import com.example.microserviciohospital.service.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/distrito")
public class DistritoController {

    @Autowired
    private DistritoService service;

    @GetMapping
    public ResponseEntity<List<Distrito>> listar(){
        List<Distrito> obj = service.listar();
        return new ResponseEntity<List<Distrito>>(obj, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Distrito> registrar(@RequestBody Distrito distrito){
        Distrito obj = service.registrar(distrito);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdDistrito()).toUri();
        return ResponseEntity.created(uri).build();
    }


    @PutMapping
    public ResponseEntity<Distrito> actualizar( @RequestBody Distrito distrito){
        Distrito obj = service.actualizar(distrito);
        return new ResponseEntity<Distrito>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar( @PathVariable("id") Long id) throws Exception {
        Distrito obj = service.listarPorId(id);
        if(obj == null){
            throw new Exception("No se encontro ID");
        }
        service.eliminar(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Distrito> ListarPorId (@PathVariable("id") Long codigo) throws Exception {
        Distrito obj = service.listarPorId(codigo);
        if(obj == null){
            throw new Exception("No se encontro ID");
        }
        return new ResponseEntity<Distrito>(obj, HttpStatus.OK);
    }


}
