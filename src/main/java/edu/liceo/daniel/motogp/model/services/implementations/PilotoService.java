package edu.liceo.daniel.motogp.model.services.implementations;

import java.util.List;
import java.util.Optional;

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
// con el findbyid hay que usar el optional para evitar errores
    @Override
    public Piloto conseguirPiloto(Integer id) {
        Optional<Piloto> op = pilotosRepo.findById(id);
        if (op.isPresent()) {
            return op.get();
        }
        return null;
    }

}
