/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disney.controller;

import com.disney.entity.Personaje;
import com.disney.service.PersonajeServiceImpl;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author orjue
 */
@RestController
@RequestMapping("/personajes")
public class PersonajeController {
    
    @Autowired
    private PersonajeServiceImpl personajeService;
    
    @GetMapping("/{pageNo}/{pageSize}")
        public ResponseEntity<?> getPersonajesPagination(@PathVariable int pageNo, @PathVariable int pageSize) {
        
        List<Personaje> listaPersonajes = new ArrayList<>();
        Map<String, Object> response = new HashMap<>();
        
        listaPersonajes = personajeService.findPaginated(pageNo, pageSize);
        response.put("pageNo", pageNo);
        response.put("pageSize", pageSize);
        response.put("data", listaPersonajes);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
        
    @PostMapping()
    public ResponseEntity<?> savePersonaje(@Valid @RequestBody Personaje personaje, BindingResult result) {

        Personaje nuevoPersonaje = null;
        Map<String, Object> response = new HashMap<>();
        List<String> errors = new ArrayList<>();

        if (result.hasErrors()) {

            for (FieldError error : result.getFieldErrors()) {
                errors.add(error.getDefaultMessage());
            }

            response.put("errors", errors);

            return new ResponseEntity<>(response, HttpStatus.UNPROCESSABLE_ENTITY);
        }

        try {

            nuevoPersonaje = personajeService.save(personaje);

        } catch (Exception e) {

            response.put("message", "error_saving_personaje");
            response.put("error", e.getMessage());

            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("message", "successfully_created_personaje");
        response.put("personaje", nuevoPersonaje);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
