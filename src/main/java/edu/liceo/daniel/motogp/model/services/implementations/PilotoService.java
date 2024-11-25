package edu.liceo.daniel.motogp.model.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.liceo.daniel.motogp.model.entities.Piloto;
import edu.liceo.daniel.motogp.model.repositories.IPilotoRepository;
import edu.liceo.daniel.motogp.model.services.interfaces.IPilotoService;
@Service
public class PilotoService implements IPilotoService {
    @Autowired
    IPilotoRepository pilotosRepo;

    @Override
    public List<Piloto> conseguirPilotos() {
       return pilotosRepo.findAll();
    }

}
