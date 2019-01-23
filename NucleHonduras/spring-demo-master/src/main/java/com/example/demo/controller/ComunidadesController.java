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

import com.example.demo.model.Comunidades;
import com.example.demo.model.ComunidadesService;



@Controller
public class ComunidadesController {
	
	@Autowired
	ComunidadesService comunidadesService;
	
	@GetMapping("/comunidades")
	public String listPersonView(Model model) {
		model.addAttribute("comunidades", comunidadesService.getAll());
		
		return "comunidades";
	}
	
	@GetMapping("/comunidades/add")
	public String addPersonView(Comunidades comunidad, Model model) {
		model.addAttribute("comunidades", comunidadesService.getAll());
		model.addAttribute("comunidad", comunidad);
		
		return "addComunidades";
	}
	
	@GetMapping("/comunidades/edit/{id}")
	public String editPersonView(@PathVariable("id") String id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("comunidad", comunidadesService.getById(id));
		return "updateComunidad";
	}
	
	@GetMapping("/comunidades/consult/{id}")
	public String ConsultPersonView(@PathVariable("id") String id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("comunidad", comunidadesService.getById(id));
		return "consultarComunidad";
	}
	
	@PostMapping("/comunidades")
	public String save(@Valid Comunidades comunidad, BindingResult result, Model model) {
		try {
			comunidadesService.add(comunidad);
			model.addAttribute("create", true);
		} catch (Exception er) {
			model.addAttribute("create", false);
		}
		return listPersonView(model);
	}
	
	@PostMapping("/comunidades/edit")
	public String update(@Valid Comunidades comunidad, BindingResult result, Model model) {
		try {
			comunidadesService.update(comunidad);
			model.addAttribute("update", true);
		} catch (Exception er) {
			model.addAttribute("update", false);
		}
		return listPersonView(model);
	}
	
	@DeleteMapping("/comunidades/{id}")
	public String delete(@PathVariable("id") String id, Model model) {
		try {
			comunidadesService.delete(id);
			model.addAttribute("delete", true);
		} catch (Exception er) {
			model.addAttribute("delete", false);
		}
		return listPersonView(model);
	}
}
