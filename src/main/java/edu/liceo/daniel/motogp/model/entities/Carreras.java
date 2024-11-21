package edu.liceo.daniel.motogp.model.entities;

import edu.liceo.daniel.motogp.model.enumerated.posicion;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Carreras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer idPiloto;
    private Integer idCircuito;
    private String temporada;
    @Enumerated(EnumType.STRING)
    // revisar porque no puedo poner en mayusculas el enum y cambiar el sql 
    private posicion posicion;
}
