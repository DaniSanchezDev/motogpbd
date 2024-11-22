package edu.liceo.daniel.motogp.model.entities;

import edu.liceo.daniel.motogp.model.enumerated.Posicion;
import jakarta.persistence.Column;
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
    @Column(nullable = false)
    private Integer idPiloto;
    @Column(nullable = false)
    private Integer idCircuito;
    @Column(length = 10,nullable = false)
    private String temporada;
    @Enumerated(EnumType.STRING)
    // revisar porque no puedo poner en mayusculas el enum y cambiar el sql 
    private Posicion posicion;
}
