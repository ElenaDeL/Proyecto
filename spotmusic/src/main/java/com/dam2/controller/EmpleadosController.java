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

import com.dam2.model.Empleado;
import com.dam2.services.EmpleadoService;

@Controller
public class EmpleadosController {
	
	@Autowired
	private EmpleadoService servicio;
	
	//listado de todos los empleados
	@GetMapping({"/","empleado/list"})
	public String listado(Model model) {
		model.addAttribute("listaEmpleados",servicio.findAll());
		return "list";		
	}
	
	//formulario de creación
	@GetMapping("/empleado/new")
	public String nuevoEmpleadoForm(Model model) {
		model.addAttribute("empleadoForm", new Empleado());
		return "form";
	}
	
	@PostMapping("/empleado/new/submit")
	public String nuevoEmpleadoSubmit(@Valid @ModelAttribute("empleadoForm")Empleado nuevoEmpleado, BindingResult binding) {
		
		if(binding.hasErrors()) {
			return "form";
		}else {
			
			servicio.add(nuevoEmpleado);
			return "redirect:/empleado/list";
		}
	}
	
	//formulario de edición
	
	@GetMapping("/empleado/edit/{id}")
	public String editarEmpleadoForm(@PathVariable long id,Model model) {
		
		Empleado empleado = servicio.findById(id);
		if(empleado !=null) {
			model.addAttribute("empleadoForm", empleado);
			return "form";			
		}else {
			return "redirect:/empleado/new";

		}
	}
	
	@PostMapping("/empleado/edit/submit")
	public String editarEmpleadoSubmit(@Valid @ModelAttribute("empleadoForm")Empleado empleado, 
			BindingResult result) {
		
		if(result.hasErrors()) {
			return "form";
		}else {
			servicio.edit(empleado);
			return "redirect:/empleado/list";
		}
	}
}
