package com.ejercicio.springboot.jpa.springboot_jpa.services;

import com.ejercicio.springboot.jpa.springboot_jpa.entities.Movimiento;

public interface MovimientoService {
    Movimiento save(Movimiento movimiento);
    //boolean existsBySku(String sku);
}
