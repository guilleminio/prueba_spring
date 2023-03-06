package com.guilleminio.gestionusuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.guilleminio.gestionusuarios.controller")
@ComponentScan(basePackages = "com.guilleminio.gestionusuarios.entity")
@ComponentScan(basePackages = "com.guilleminio.gestionusuarios.repository")
@ComponentScan(basePackages = "com.guilleminio.gestionusuarios.service")
public class GestionUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionUsuariosApplication.class, args);
	}

}
