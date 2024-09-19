package com.ejercicio.springboot.jpa.springboot_jpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejercicio.springboot.jpa.springboot_jpa.entities.Persona;
import com.ejercicio.springboot.jpa.springboot_jpa.repositories.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{
    @Autowired
    private PersonaRepository repository;

    @Override
    @Transactional
    public Persona save(Persona persona) {
        return repository.save(persona);
    }
}
