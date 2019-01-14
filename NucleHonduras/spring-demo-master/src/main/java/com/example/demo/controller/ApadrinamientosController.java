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

import com.example.demo.model.Apadrinamientos;
import com.example.demo.model.ApadrinamientosService;



@Controller
public class ApadrinamientosController {
	
	@Autowired
	ApadrinamientosService apService;
	
	@GetMapping("/apadrinamientos")
	public String listPersonView(Model model) {
		model.addAttribute("apadrinamientos", apService.getAll());
		
		return "apadrinamientos";
	}
	
	@GetMapping("/apadrinamientos/add")
	public String addPersonView(Apadrinamientos ap, Model model) {
		model.addAttribute("apadrinamientos", apService.getAll());
		model.addAttribute("apadrinamiento", ap);
		
		return "addApadrinamientos";
	}
	
	@GetMapping("/apadrinamientos/edit/{id}")
	public String editPersonView(@PathVariable("id") Long id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("apadrinamiento", apService.getById(id));
		return "updateApadrinamiento";
	}
	
	@GetMapping("/apadrinamientos/consult/{id}")
	public String ConsultPersonView(@PathVariable("id") Long id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("apadrinamiento", apService.getById(id));
		return "consultarApadrinamiento";
	}
	
	@PostMapping("/apadrinamientos")
	public String save(@Valid Apadrinamientos a, BindingResult result, Model model) {
		try {
			apService.add(a);
			model.addAttribute("create", true);
		} catch (Exception er) {
			model.addAttribute("create", false);
		}
		return listPersonView(model);
	}
	
	@PostMapping("/apadrinamientos/edit")
	public String update(@Valid Apadrinamientos a, BindingResult result, Model model) {
		try {
			apService.update(a);
			model.addAttribute("udpate", true);
		} catch (Exception er) {
			model.addAttribute("update", false);
		}
		return listPersonView(model);
	}
	
	@DeleteMapping("/apadrinamientos/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		try {
			apService.delete(id);
			model.addAttribute("delete", true);
		} catch (Exception er) {
			model.addAttribute("delete", false);
		}
		return listPersonView(model);
	}
}

