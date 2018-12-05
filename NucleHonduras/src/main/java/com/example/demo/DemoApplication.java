package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Libro;
import com.example.demo.model.LibroService;
import com.example.demo.model.Persona;
import com.example.demo.model.PersonaService;

@SpringBootApplication
public class DemoApplication {

	// JPA
	// https://www.objectdb.com/java/jpa/entity/id

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(LibroService libroService, PersonaService personaService) {
		return (args) -> {
			// crear datos al arrancar la aplicación
			// se usa para meter datos de prueba
			Persona alae = new Persona("Alae", "Agente", "666");
			Persona alejandro = new Persona("Alejandro", "Agente", "777");
			Persona tomas = new Persona("Tomas", "Agente", "777");
			Persona jose = new Persona("Jose", "Agente", "777");
			personaService.add(alae);
			personaService.add(alejandro);
			personaService.add(tomas);
			personaService.add(jose);

			Libro libro1 = new Libro(12312l, "Alae Akalay", 100d, alae, alejandro);
			Libro libro2 = new Libro(1122l, "Alejandro Corraliza", 1000d, tomas, jose);
		
			libroService.add(libro1);
			libroService.add(libro2);

			// ejemplo de como buscar por nombre
			Libro l1 = libroService.getByName("Introduccion a Spring");
			Libro libroInexistente = libroService.getByName("NONAME");
		};
	}

}
