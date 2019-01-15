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

import com.example.demo.model.Becados;
import com.example.demo.model.BecadosService;



@Controller
public class BecadosController {
	
	@Autowired
	BecadosService becadosService;
	
	@GetMapping("/becados")
	public String listPersonView(Model model) {
		model.addAttribute("becados", becadosService.getAll());
		
		return "becados";
	}
	
	
	
	@GetMapping("/becados/add")
	public String addPersonView(Becados becado, Model model) {
		model.addAttribute("becados", becadosService.getAll());
		model.addAttribute("becado", becado);
		
		return "addBecados";
	}
	
	@GetMapping("/becados/edit/{id}")
	public String editPersonView(@PathVariable("id") String id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("becado", becadosService.getById(id));
		return "updateBecado";
	}
	
	@GetMapping("/becados/consult/{id}")
	public String ConsultPersonView(@PathVariable("id") String id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("becado", becadosService.getById(id));
		return "consultarBecado";
	}
	
	@PostMapping("/becados")
	public String save(@Valid Becados becado, BindingResult result, Model model) {
		try {
			becadosService.add(becado);
			model.addAttribute("create", true);
		} catch (Exception er) {
			model.addAttribute("create", false);
		}
		return listPersonView(model);
	}
	
	@PostMapping("/becados/edit")
	public String update(@Valid Becados becado, BindingResult result, Model model) {
		try {
			becadosService.update(becado);
			model.addAttribute("update", true);
		} catch (Exception er) {
			model.addAttribute("update", false);
		}
		return listPersonView(model);
	}
	
	@DeleteMapping("/becados/{id}")
	public String delete(@PathVariable("id") String id, Model model) {
		try {
			becadosService.delete(id);
			model.addAttribute("delete", true);
		} catch (Exception er) {
			model.addAttribute("delete", false);
		}
		return listPersonView(model);
	}
}
