package com.ejercicio.springboot.jpa.springboot_jpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejercicio.springboot.jpa.springboot_jpa.entities.Movimiento;
import com.ejercicio.springboot.jpa.springboot_jpa.repositories.MovimientoRepository;

@Service
public class MovimientoServiceImpl implements MovimientoService{
    @Autowired
    private MovimientoRepository repository;

    @Override
    @Transactional
    public Movimiento save(Movimiento movimiento) {
        return repository.save(movimiento);
    }

    // @Override
    // @Transactional(readOnly = true)
    // public boolean existsBySku(String sku) {
    //     return repository.existsBySku(sku);
    // }
}
