package com.tesji.apitrakstesji.model;
//Definir los campos de la tabla

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //la clase la convierte a una tabla
public class DatosApiTraks {

    //Definir los atributos
    @Id //Define la pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //La hace autoincrementable
    private long id;
    private String track;
    private String artista;
    private String genero;

    public DatosApiTraks(String track, String artista, String genero) {
        this.track = track;
        this.artista = artista;
        this.genero = genero;
    }

    public DatosApiTraks() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
