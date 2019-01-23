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

import com.example.demo.model.Bienes;
import com.example.demo.model.BienesService;



@Controller
public class BienesController {
	
	@Autowired
	BienesService bienesService;
	
	@GetMapping("/bienes")
	public String listPersonView(Model model) {
		model.addAttribute("bienes", bienesService.getAll());
		
		return "bienes";
	}
	
	
	
	@GetMapping("/bienes/add")
	public String addPersonView(Bienes bien, Model model) {
		model.addAttribute("bienes", bienesService.getAll());
		model.addAttribute("bien", bien);
		
		return "addBienes";
	}
	
	@GetMapping("/bienes/edit/{id}")
	public String editPersonView(@PathVariable("id") String id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("bien", bienesService.getById(id));
		return "updateBien";
	}
	
	@GetMapping("/bienes/consult/{id}")
	public String ConsultPersonView(@PathVariable("id") String id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("bien", bienesService.getById(id));
		return "consultarBienes";
	}
	
	@PostMapping("/bienes")
	public String save(@Valid Bienes bien, BindingResult result, Model model) {
		try {
			bienesService.add(bien);
			model.addAttribute("create", true);
		} catch (Exception er) {
			model.addAttribute("create", false);
		}
		return listPersonView(model);
	}
	
	@PostMapping("/bienes/edit")
	public String update(@Valid Bienes bien, BindingResult result, Model model) {
		try {
			bienesService.update(bien);
			model.addAttribute("update", true);
		} catch (Exception er) {
			model.addAttribute("update", false);
		}
		return listPersonView(model);
	}
	
	@DeleteMapping("/bienes/{id}")
	public String delete(@PathVariable("id") String id, Model model) {
		try {
			bienesService.delete(id);
			model.addAttribute("delete", true);
		} catch (Exception er) {
			model.addAttribute("delete", false);
		}
		return listPersonView(model);
	}
}
