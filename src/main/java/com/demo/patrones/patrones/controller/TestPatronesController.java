package com.demo.patrones.patrones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.patrones.patrones.services.factory.AbstractFactoryService;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.AbstractFactory;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.ActionsOffice;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.Area;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.constant.TypeAbstractFactory;
import com.demo.patrones.patrones.patrones.creacionales.factorymethod.Factory;
import com.demo.patrones.patrones.patrones.creacionales.factorymethod.constant.TypeFactory;
import com.demo.patrones.patrones.services.factory.FactFactory;
import com.demo.patrones.patrones.services.factory.constant.TypeAbstract;

@RestController
@CrossOrigin()
public class TestPatronesController {

    @Autowired
    private FactFactory factory;
    @Autowired
    private AbstractFactoryService abstractFactory;

    @GetMapping("/factory")
    public ResponseEntity<?> factory(@RequestParam TypeFactory typeFactory) {
        try {
            Factory f = factory.buildFactory(typeFactory);
            f.doFactory();
            return new ResponseEntity<>(null, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/abstractFactory")
    public ResponseEntity<?> abstractFactory(@RequestParam TypeAbstractFactory typeFactory) {
        try {
            AbstractFactory af = abstractFactory.buildAbstractFactory(TypeAbstract.Office);
            Area area = (Area) af.create(typeFactory);
            System.out.println("Nombre: " + area.getName() + "\n Descripción: " + area.getDescription());

            af = abstractFactory.buildAbstractFactory(TypeAbstract.Actions);
            ActionsOffice actionOffcie = (ActionsOffice) af.create(typeFactory);
            System.out.println("Acción: " + actionOffcie.getActions() + "\n Porcentaje: " + actionOffcie.getPercentageAction());

            return new ResponseEntity<>(null, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
