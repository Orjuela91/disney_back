/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disney.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;

/**
 *
 * @author orjue
 */
@Entity
@Table(name = "personajes")
public class Personaje implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "nombre_null") // agrega el constraint not null en la tabla SQL, ademas valida que la propiedad no este nula en el Objeto cuando se va guardar en la bd
    @NotBlank(message = "nombre_blank") // valida que la propiedad no sea "" en el Objeto cuando se va guardar en la bd
    private String nombre;
    
    @NotNull(message = "tv_show_null")// agrega el constraint not null en la tabla SQL, ademas valida que la propiedad no este nula en el Objeto cuando se va guardar en la bd
    @Column(name = "tv_show")
    private String tvShow;
    
    @NotNull(message = "api_id_null")// agrega el constraint not null en la tabla SQL, ademas valida que la propiedad no este nula en el Objeto cuando se va guardar en la bd
    @Column(name = "api_id")
    private Long apiId;
    
    @NotNull(message = "foto_null")// agrega el constraint not null en la tabla SQL, ademas valida que la propiedad no este nula en el Objeto cuando se va guardar en la bd
    private String foto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTvShow() {
        return tvShow;
    }

    public void setTvShow(String tvShow) {
        this.tvShow = tvShow;
    }

    public Long getApiId() {
        return apiId;
    }

    public void setApiId(Long apiId) {
        this.apiId = apiId;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
}


