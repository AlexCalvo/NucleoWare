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

import com.example.demo.model.Proyectos;
import com.example.demo.model.ProyectosService;



@Controller
public class ProyectosController {
	
	@Autowired
	ProyectosService proyectosService;
	
	@GetMapping("/proyectos")
	public String listPersonView(Model model) {
		model.addAttribute("proyectos", proyectosService.getAll());
		
		return "proyectos";
	}
	
	@GetMapping("/proyectos/add")
	public String addPersonView(Proyectos proyecto, Model model) {
		model.addAttribute("proyectos", proyectosService.getAll());
		model.addAttribute("proyecto", proyecto);
		
		return "addProyectos";
	}
	
	@GetMapping("/proyectos/edit/{id}")
	public String editPersonView(@PathVariable("id") String id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("proyecto", proyectosService.getById(id));
		return "updateProyecto";
	}
	
	@GetMapping("/proyectos/consult/{id}")
	public String ConsultPersonView(@PathVariable("id") String id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("proyecto", proyectosService.getById(id));
		return "consultarProyecto";
	}
	
	@PostMapping("/proyectos")
	public String save(@Valid Proyectos proyecto, BindingResult result, Model model) {
		try {
			proyectosService.add(proyecto);
			model.addAttribute("create", true);
		} catch (Exception er) {
			model.addAttribute("create", false);
		}
		return listPersonView(model);
	}
	
	@PostMapping("/proyectos/edit")
	public String update(@Valid Proyectos proyecto, BindingResult result, Model model) {
		try {
			proyectosService.update(proyecto);
			model.addAttribute("udpate", true);
		} catch (Exception er) {
			model.addAttribute("update", false);
		}
		return listPersonView(model);
	}
	
	@DeleteMapping("/proyectos/{id}")
	public String delete(@PathVariable("id") String id, Model model) {
		try {
			proyectosService.delete(id);
			model.addAttribute("delete", true);
		} catch (Exception er) {
			model.addAttribute("delete", false);
		}
		return listPersonView(model);
	}
}
