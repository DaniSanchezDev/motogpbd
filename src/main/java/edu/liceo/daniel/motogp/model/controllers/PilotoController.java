package edu.liceo.daniel.motogp.model.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.liceo.daniel.motogp.model.services.implementations.PilotoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/pilotos")
public class PilotoController {

    @Autowired
    PilotoService pilotoServ;

    @GetMapping("/all")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}
