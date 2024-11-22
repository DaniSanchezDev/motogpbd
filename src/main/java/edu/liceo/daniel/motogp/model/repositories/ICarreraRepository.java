package edu.liceo.daniel.motogp.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.liceo.daniel.motogp.model.entities.Carrera;

public interface ICarreraRepository extends JpaRepository<Carrera, Integer> {

}
