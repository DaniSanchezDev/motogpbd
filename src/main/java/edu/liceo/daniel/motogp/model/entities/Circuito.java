package edu.liceo.daniel.motogp.model.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "circuitos")
public class Circuito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false, unique = true)
    private String nombre;
    @Column(length = 70, nullable = false)
    private String localidad;
    @OneToMany(mappedBy = "idCircuito", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Carrera> listaCarreras;

    
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


    @Override
    public String toString() {
        return "Circuito [id=" + id + ", nombre=" + nombre + ", localidad=" + localidad + "]";
    }

    

}
