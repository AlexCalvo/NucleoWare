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

import com.example.demo.model.Ingresos;
import com.example.demo.model.IngresosService;



@Controller
public class IngresosController {
	
	@Autowired
	IngresosService ingresosService;
	
	@GetMapping("/ingresos")
	public String listPersonView(Model model) {
		model.addAttribute("ingresos", ingresosService.getAll());
		
		return "ingresos";
	}
	
	@GetMapping("/economia")
	public String listEconomyView(Model model) {
		model.addAttribute("economia", ingresosService.getAll());
		
		return "economia";
	}
	
	@GetMapping("/ingresos/add")
	public String addPersonView(Ingresos ingreso, Model model) {
		model.addAttribute("ingresos", ingresosService.getAll());
		model.addAttribute("ingreso", ingreso);
		
		return "addIngresos";
	}
	
	@GetMapping("/ingresos/edit/{id}")
	public String editPersonView(@PathVariable("id") Long id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("ingreso", ingresosService.getById(id));
		return "updateIngreso";
	}
	
	
	
	@PostMapping("/ingresos")
	public String save(@Valid Ingresos ingreso, BindingResult result, Model model) {
		try {
			ingresosService.add(ingreso);
			model.addAttribute("create", true);
		} catch (Exception er) {
			model.addAttribute("create", false);
		}
		return listPersonView(model);
	}
	
	@PostMapping("/ingresos/edit")
	public String update(@Valid Ingresos ingreso, BindingResult result, Model model) {
		try {
			ingresosService.update(ingreso);
			model.addAttribute("udpate", true);
		} catch (Exception er) {
			model.addAttribute("update", false);
		}
		return listPersonView(model);
	}
	
	@DeleteMapping("/ingresos/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		try {
			ingresosService.delete(id);
			model.addAttribute("delete", true);
		} catch (Exception er) {
			model.addAttribute("delete", false);
		}
		return listPersonView(model);
	}
}
