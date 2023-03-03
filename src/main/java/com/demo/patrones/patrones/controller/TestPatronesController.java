package com.demo.patrones.patrones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.patrones.patrones.patrones.creacionales.factorymethod.Factory;
import com.demo.patrones.patrones.patrones.creacionales.factorymethod.constant.TypeFactory;
import com.demo.patrones.patrones.services.factory.FactFactory;

@RestController
@CrossOrigin()
public class TestPatronesController {

    @Autowired
    private FactFactory factory;

    @GetMapping("/factory")
    public ResponseEntity<?> stats(@RequestParam TypeFactory typeFactory) {
        try {
            Factory f = factory.buildFactory(typeFactory);
            f.doFactory();
            return new ResponseEntity<>(null, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
