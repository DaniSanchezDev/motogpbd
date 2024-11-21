package edu.liceo.daniel.motogp.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "circuito")
public class Circuito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false, unique = true)
    private String nombre;
    @Column(length = 70, nullable = false)
    private String localidad;

    
    public Circuito() {
    }


    public Circuito(Integer id, String nombre, String localidad) {
        this.id = id;
        this.nombre = nombre;
        this.localidad = localidad;
    }


    public Circuito(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
    }

    

}
