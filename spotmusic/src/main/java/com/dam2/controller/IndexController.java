package com.dam2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@GetMapping({"/","/index"})
	public String index() {
		return "index";		
	}
	
	@GetMapping("/iniciosesion")
	public String iniciosession() {
		return "iniciosesion";		
	}
	
	@GetMapping("/musica")
	public String musica() {
		return "musica";		
	}
	
	@GetMapping("/registro")
	public String registro() {
		return "registro";		
	}
	

}
