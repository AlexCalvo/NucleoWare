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

import com.example.demo.model.User;
import com.example.demo.model.UserService;



@Controller
public class UserController {
	
	@Autowired
	UserService usuarioService;
	
	@GetMapping("/usuario")
	public String listPersonView(Model model) {
		model.addAttribute("usuarios", usuarioService.getAll());
		
		return "usuarios";
	}
	
	@GetMapping("/usuario/add")
	public String addPersonView(User usuario, Model model) {
		model.addAttribute("usuarios", usuarioService.getAll());
		model.addAttribute("usuario", usuario);
		
		return "addUsuario";
	}
	
	@GetMapping("/usuario/edit/{id}")
	public String editPersonView(@PathVariable("id") Long id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("usuario", usuarioService.getById(id));
		return "updateUsuario";
	}
	
	@PostMapping("/usuario")
	public String save(@Valid User usuario, BindingResult result, Model model) {
		try {
			usuarioService.add(usuario);
			model.addAttribute("create", true);
		} catch (Exception er) {
			model.addAttribute("create", false);
		}
		return listPersonView(model);
	}
	
	@PostMapping("/usuario/edit")
	public String update(@Valid User usuario, BindingResult result, Model model) {
		try {
			usuarioService.update(usuario);
			model.addAttribute("udpate", true);
		} catch (Exception er) {
			model.addAttribute("update", false);
		}
		return listPersonView(model);
	}
	
	@DeleteMapping("/usuario/{id}")
	public String delete(@PathVariable("id") Long id, Model model) {
		try {
			usuarioService.delete(id);
			model.addAttribute("delete", true);
		} catch (Exception er) {
			model.addAttribute("delete", false);
		}
		return listPersonView(model);
	}
}

