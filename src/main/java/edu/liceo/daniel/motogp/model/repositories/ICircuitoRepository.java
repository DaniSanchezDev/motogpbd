package edu.liceo.daniel.motogp.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.liceo.daniel.motogp.model.entities.Circuito;

public interface ICircuitoRepository extends JpaRepository<Circuito, Integer> {

}
