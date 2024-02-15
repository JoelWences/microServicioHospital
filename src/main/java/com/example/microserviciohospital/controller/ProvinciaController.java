package com.example.microserviciohospital.controller;

import com.example.microserviciohospital.model.Distrito;
import com.example.microserviciohospital.model.Provincia;
import com.example.microserviciohospital.service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/provincia")
public class ProvinciaController {

    @Autowired
    private ProvinciaService service;

    @GetMapping
    public ResponseEntity<List<Provincia>> listar(){
        List<Provincia> obj = service.listar();
        return new ResponseEntity<List<Provincia>>(obj, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Provincia> registrar(@RequestBody Provincia provincia){
        Provincia obj = service.registrar(provincia);
        return new ResponseEntity<Provincia>(obj, HttpStatus.OK);
    }


    @PutMapping
    public ResponseEntity<Provincia> actualizar( @RequestBody Provincia provincia){
        Provincia obj = service.actualizar(provincia);
        return new ResponseEntity<Provincia>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar( @PathVariable("id") Long id) throws Exception {
        Provincia obj = service.listarPorId(id);
        if(obj == null){
            throw new Exception("No se encontro ID");
        }
        service.eliminar(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Provincia> ListarPorId (@PathVariable("id") Long codigo) throws Exception {
        Provincia obj = service.listarPorId(codigo);
        if(obj == null){
            throw new Exception("No se encontro ID");
        }
        return new ResponseEntity<Provincia>(obj, HttpStatus.OK);
    }

}
