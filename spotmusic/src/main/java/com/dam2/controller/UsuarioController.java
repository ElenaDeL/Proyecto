package com.dam2.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dam2.model.Usuario;
import com.dam2.services.UsuarioServicio;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioServicio servicio;
	

//	//listado de todos los usuairos
//	@GetMapping({"/","usuario/list2"})
//	public String listado(Model model) {
//		model.addAttribute("listaUsuario",servicio.vertodas());
//		return "list2";		
//	}
	
	//formulario de creación
	@GetMapping("/usuario/new")
	public String nuevoEmpleadoForm(Model model) {
		model.addAttribute("usuarioForm", new Usuario());
		return "registro";
	}
	
	@PostMapping("/usuario/new/submit")
	public String nuevoEmpleadoSubmit(@Valid @ModelAttribute("usuarioForm")Usuario nuevoEmpleado, BindingResult binding) {
		
		if(binding.hasErrors()) {
			return "registro";
		}else {
			
			servicio.inserUsuario(nuevoEmpleado);
			return "redirect:/usuario/list";
		}
	}
	



}
