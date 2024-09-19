package com.ejercicio.springboot.jpa.springboot_jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ejercicio.springboot.jpa.springboot_jpa.entities.Cliente;
import com.ejercicio.springboot.jpa.springboot_jpa.repositories.ClienteRepository;

@SpringBootApplication
public class SpringbootJpaApplication {//implements CommandLineRunner

	@Autowired
	private ClienteRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception {
	// 	List<Cliente> clientes = (List<Cliente>) repository.findAll();
	// 	clientes.stream().forEach(cliente -> {
	// 		System.out.println(cliente);
	// 	});
	// }
}
