package edu.liceo.daniel.motogp.model.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.liceo.daniel.motogp.model.entities.Piloto;
import edu.liceo.daniel.motogp.model.services.implementations.PilotoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/pilotos")
public class PilotoController {

    @Autowired
    PilotoService pilotoServ;
// 1. Conseguir todos los pilotos
    @GetMapping("/all")
    public List<Piloto> getPilotos() {
        return pilotoServ.conseguirPilotos();
    }

    @GetMapping("/{id}")
    public Piloto getPiloto(@PathVariable("id") Integer idUrl) {
        return pilotoServ.conseguirPiloto(idUrl);
    }
    
    
}
