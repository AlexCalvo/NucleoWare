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

import com.example.demo.model.Gastos;
import com.example.demo.model.GastosService;



@Controller
public class GastosController {
	
	@Autowired
	GastosService gastosService;
	
	@GetMapping("/gastos")
	public String listPersonView(Model model) {
		model.addAttribute("gastos", gastosService.getAll());
		
		return "gastos";
	}
	
	/*
	 * @GetMapping("/economia")
	public String listEconomyView(Model model) {
		model.addAttribute("economia", gastosService.getAll());
		
		return "economia";
	}
	
	 */
	
	@GetMapping("/gastos/add")
	public String addPersonView(Gastos gasto, Model model) {
		model.addAttribute("gastos", gastosService.getAll());
		model.addAttribute("gasto", gasto);
		
		return "addGastos";
	}
	
	@GetMapping("/gastos/edit/{id}")
	public String editPersonView(@PathVariable("id") Long id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("gasto", gastosService.getById(id));
		return "updateGasto";
	}
	
	
	
	@PostMapping("/gastos")
	public String save(@Valid Gastos gasto, BindingResult result, Model model) {
		try {
			gastosService.add(gasto);
			model.addAttribute("create", true);
		} catch (Exception er) {
			model.addAttribute("create", false);
		}
		return listPersonView(model);
	}
	
	@PostMapping("/gastos/edit")
	public String update(@Valid Gastos gasto, BindingResult result, Model model) {
		try {
			gastosService.update(gasto);
			model.addAttribute("update", true);
		} catch (Exception er) {
			model.addAttribute("update", false);
		}
		return listPersonView(model);
	}
	
	@DeleteMapping("/gastos/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		try {
			gastosService.delete(id);
			model.addAttribute("delete", true);
		} catch (Exception er) {
			model.addAttribute("delete", false);
		}
		return listPersonView(model);
	}
}
