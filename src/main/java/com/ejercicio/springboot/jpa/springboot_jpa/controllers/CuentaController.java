package com.ejercicio.springboot.jpa.springboot_jpa.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.springboot.jpa.springboot_jpa.entities.Cuenta;
import com.ejercicio.springboot.jpa.springboot_jpa.entities.Cliente;
import com.ejercicio.springboot.jpa.springboot_jpa.repositories.ClienteRepository;
import com.ejercicio.springboot.jpa.springboot_jpa.repositories.PersonaRepository;
import com.ejercicio.springboot.jpa.springboot_jpa.services.CuentaService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/cuentas")
public class CuentaController {
    @Autowired
    private CuentaService service;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PersonaRepository personaRepository;

    @PostMapping
    public ResponseEntity<?> create(@Valid @PathVariable(value = "idcliente") Long idcliente, @RequestBody Cuenta cuenta, BindingResult result) {
            Optional<Object> cuenta2 = clienteRepository.findById(idcliente).map(cliente -> {
            cuenta.setCliente(cliente);
            return service.save(cuenta);
        });
        // if (result.hasFieldErrors()) {
        //     return validation(result);
        // }
        // return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cuenta));
        return new ResponseEntity<>(cuenta2, HttpStatus.CREATED);
    }

    private ResponseEntity<?> validation(BindingResult result) {
        Map<String, String> errors = new HashMap<>();
        result.getFieldErrors().forEach(err -> {
            errors.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errors);
    }
}
