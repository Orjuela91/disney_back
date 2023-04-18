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
@Table(name = "usuarios")
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "username_null")// agrega el constraint not null en la tabla SQL, ademas valida que la propiedad no este nula en el Objeto cuando se va guardar en la bd
    @NotBlank(message = "username_blank")// valida que la propiedad no sea "" en el Objeto cuando se va guardar en la bd
    @Column(unique = true)// agrega el constraint unique a la columna en la tabla sql
    private String username;
    
    @NotNull(message = "nombre_null")
    @NotBlank(message = "nombre_blank")
    private String nombre;
    
    @NotNull(message = "password_null")// agrega el constraint not null en la tabla SQL, ademas valida que la propiedad no este nula en el Objeto cuando se va guardar en la bd
    @NotBlank(message = "password_blank")// valida que la propiedad no sea "" en el Objeto cuando se va guardar en la bd
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}

