package com.ejercicio.springboot.jpa.springboot_jpa.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejercicio.springboot.jpa.springboot_jpa.entities.Cuenta;
import com.ejercicio.springboot.jpa.springboot_jpa.repositories.CuentaRepository;

@Service
public class CuentaServiceImpl implements CuentaService{
    @Autowired
    private CuentaRepository repository;
    @Override
    @Transactional
    public Cuenta save(Cuenta cuenta) {
        return repository.save(cuenta);
    }
}
