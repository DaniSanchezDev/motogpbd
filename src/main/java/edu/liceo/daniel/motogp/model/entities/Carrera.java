package edu.liceo.daniel.motogp.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.liceo.daniel.motogp.model.enumerated.Posicion;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "carreras")
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = true, targetEntity = Piloto.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_piloto")
    private Piloto piloto;

    @ManyToOne
    @JoinColumn(name = "id_circuito")
    private Circuito circuito;

    @Column(length = 10,nullable = false)
    private String temporada;

    @Enumerated(EnumType.ORDINAL) // maneja el enum como si fueran ints
    @Column(length = 10, nullable = false)
    private Posicion posicion;  


    public Carrera() {
    }
    public Carrera(Integer id, Piloto piloto, Circuito circuito, String temporada, Posicion posicion) {
        this.id = id;
        this.piloto = piloto;
        this.circuito = circuito;
        this.temporada = temporada;
        this.posicion = posicion;
    }
    public Carrera(Piloto piloto, Circuito circuito, String temporada, Posicion posicion) {
        this.piloto = piloto;
        this.circuito = circuito;
        this.temporada = temporada;
        this.posicion = posicion;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Piloto getPiloto() {
        return piloto;
    }
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
    public Circuito getCircuito() {
        return circuito;
    }
    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }
    public String getTemporada() {
        return temporada;
    }
    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    public Posicion getPosicion() {
        return posicion;
    }
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    @Override
    public String toString() {
        return "Carrera [id=" + id + ", piloto=" + piloto + ", circuito=" + circuito + ", temporada=" + temporada
                + ", posicion=" + posicion + "]";
    }


    


    
}
