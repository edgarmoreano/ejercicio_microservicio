package com.ejercicio.springboot.jpa.springboot_jpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ejercicio.springboot.jpa.springboot_jpa.entities.Movimiento;

public interface MovimientoRepository extends CrudRepository<Movimiento, Long>{
    //boolean existsBySku(String sku);
}
