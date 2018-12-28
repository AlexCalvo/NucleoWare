package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Socios;
import com.example.demo.model.SociosService;

//Controlador de los objetos Persona
@Controller
public class SociosController {

	@Autowired
	SociosService socioService;

	/*---Devuelve el template de personas---*/
	@GetMapping("/socios")
	public String listPersonView(Model model) {
		model.addAttribute("personas", socioService.getAll());
		// devuelvo el template socios
		return "socios";
	}

	/*---Devuelve el formulario para crear un socio---*/
	@GetMapping("/socios/add")
	public String addPersonView(Socios persona, Model model) {
		model.addAttribute("personas", socioService.getAll());
		model.addAttribute("persona", persona);
		return "addSocios";
	}

	/*---Devuelve el formulario para editar una persona---*/
	@GetMapping("/socios/edit/{id}")
	public String editPersonView(@PathVariable("id") String id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("persona", socioService.getByDni(id));
		return "updatePersona";
	}

	/*---Anade un nuevo socio al sistema---*/
	@PostMapping("/socios")
	public String save(@Valid Socios socio, BindingResult result, Model model) {
		try {
			socioService.add(socio);
			model.addAttribute("create", true);
		} catch (Exception er) {
			model.addAttribute("create", false);
		}
		return listPersonView(model);
	}
	
	/*---Busca un Socio del sistema---
	@PostMapping("/socios")
	public String save(@Valid Socios persona, BindingResult result, Model model) {
		try {
			personaService.add(persona);
			model.addAttribute("create", true);
		} catch (Exception er) {
			model.addAttribute("create", false);
		}
		return listPersonView(model);
	}*/

	/*---Elimina un Socio a partir de su ID---*/
	@DeleteMapping("/socios/{id}")
	public String delete(@PathVariable("id") String id, Model model) {
		try {
			socioService.delete(id);
			model.addAttribute("delete", true);
		} catch (Exception er) {
			model.addAttribute("delete", false);
		}
		return listPersonView(model);
	}

}
