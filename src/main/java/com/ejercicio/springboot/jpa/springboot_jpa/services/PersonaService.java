package com.ejercicio.springboot.jpa.springboot_jpa.services;

import com.ejercicio.springboot.jpa.springboot_jpa.entities.Persona;

public interface PersonaService {
    //List<Persona> findAll();
    //Optional<Persona> findById(Long id);
    Persona save(Persona persona);
    //void delete(Persona persona);
}
