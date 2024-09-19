package com.ejercicio.springboot.jpa.springboot_jpa.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ejercicio.springboot.jpa.springboot_jpa.entities.Movimiento;
import com.ejercicio.springboot.jpa.springboot_jpa.services.MovimientoService;

@RestController
@RequestMapping("api/movimientos")
public class MovimientoController {
    @Autowired
    private MovimientoService service;

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody Movimiento movimiento, BindingResult result) {
        if (result.hasFieldErrors()) {
            return validation(result);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(movimiento));
    }

    private ResponseEntity<?> validation(BindingResult result) {
        Map<String, String> errors = new HashMap<>();

        result.getFieldErrors().forEach(err -> {
            errors.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errors);
    }
}
