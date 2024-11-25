package edu.liceo.daniel.motogp.model.entities;

import java.util.List;

import edu.liceo.daniel.motogp.model.enumerated.Conduccion;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "pilotos")
public class Piloto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 75, nullable = false)
    private String nombre;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Conduccion conduccion;
    @OneToMany(mappedBy = "piloto", cascade = CascadeType.ALL, fetch = FetchType.EAGER) // el cascade hace que si borramos un piloto nos borre las carreras que participo por ej
    private List<Carrera> listaCarreras;


    public Piloto() {

    }

    public Piloto(Integer id, String nombre, Conduccion conduccion) {
        this.id = id;
        this.nombre = nombre;
        this.conduccion = conduccion;
    }

    public Piloto(String nombre, Conduccion conduccion) {
        this.nombre = nombre;
        this.conduccion = conduccion;
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
    public Conduccion getConduccion() {
        return conduccion;
    }
    public void setConduccion(Conduccion conduccion) {
        this.conduccion = conduccion;
    }


    @Override
    public String toString() {
        return "Piloto [id=" + id + ", nombre=" + nombre + ", conduccion=" + conduccion + "]";
    }

    

}
