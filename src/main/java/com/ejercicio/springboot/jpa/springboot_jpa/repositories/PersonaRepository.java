package com.ejercicio.springboot.jpa.springboot_jpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ejercicio.springboot.jpa.springboot_jpa.entities.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long>{

}
