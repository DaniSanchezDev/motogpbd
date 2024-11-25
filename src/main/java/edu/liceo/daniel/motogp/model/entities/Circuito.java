package edu.liceo.daniel.motogp.model.entities;

import java.util.List;


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
    
    @OneToMany(mappedBy = "circuito", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Carrera> listaCarreras;

    
    public Circuito() {
    }


    public Circuito(String nombre, String localidad, List<Carrera> listaCarreras) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.listaCarreras = listaCarreras;
    }


    public Circuito(Integer id, String nombre, String localidad, List<Carrera> listaCarreras) {
        this.id = id;
        this.nombre = nombre;
        this.localidad = localidad;
        this.listaCarreras = listaCarreras;
    }




    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getLocalidad() {
        return localidad;
    }


    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }


    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }


    public void setListaCarreras(List<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    

    

}
