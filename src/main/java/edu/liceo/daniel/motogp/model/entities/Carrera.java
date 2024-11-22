package edu.liceo.daniel.motogp.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.liceo.daniel.motogp.model.enumerated.Posicion;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
    @ManyToOne
    @JoinColumn(name = "id_piloto")
    @JsonIgnore
    private Piloto idPiloto;
    @ManyToOne
    @JoinColumn(name = "id_circuito")
    private Circuito idCircuito;
    @Column(length = 10,nullable = false)
    private String temporada;
    @Enumerated(EnumType.STRING)
    // revisar porque no puedo poner en mayusculas el enum y cambiar el sql 
    private Posicion posicion;


    public Carrera() {
    }
    public Carrera(Integer id, Piloto idPiloto, Circuito idCircuito, String temporada, Posicion posicion) {
        this.id = id;
        this.idPiloto = idPiloto;
        this.idCircuito = idCircuito;
        this.temporada = temporada;
        this.posicion = posicion;
    }
    public Carrera(Piloto idPiloto, Circuito idCircuito, String temporada, Posicion posicion) {
        this.idPiloto = idPiloto;
        this.idCircuito = idCircuito;
        this.temporada = temporada;
        this.posicion = posicion;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Piloto getIdPiloto() {
        return idPiloto;
    }
    public void setIdPiloto(Piloto idPiloto) {
        this.idPiloto = idPiloto;
    }
    public Circuito getIdCircuito() {
        return idCircuito;
    }
    public void setIdCircuito(Circuito idCircuito) {
        this.idCircuito = idCircuito;
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
        return "Carrera [id=" + id + ", idPiloto=" + idPiloto + ", idCircuito=" + idCircuito + ", temporada="
                + temporada + ", posicion=" + posicion + "]";
    }


    
}
