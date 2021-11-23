package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class MainController {

	//**Portada**//
	@GetMapping("/")
	public String portada(Model model) {
		model.addAttribute("mensaje","Bienvenido");
		return "index";
	}
	
	
	//**Que**//
	@GetMapping("/que")
	public String que(
			@RequestParam(name="name",required=false, defaultValue="Word") String name, Model model) {
		model.addAttribute("name",name);
		return "que";
	}
	
	//**contacto**//
	@GetMapping("/contacto/{name}")
	public String contactoPath(
			@PathVariable(name="name",required=false) String name, Model model) {
		model.addAttribute("name",name);
		return "contacto";
	}
	
}
