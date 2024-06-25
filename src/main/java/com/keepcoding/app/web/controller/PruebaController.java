package com.keepcoding.app.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.keepcoding.app.web.entity.Prueba;

@Controller
public class PruebaController {

	@GetMapping("/saludo")
	public String Saludar(Model modelo) {
		List<Prueba> lista = new ArrayList<>();
		Prueba objprueba = new Prueba();
		Prueba objprueba2 = new Prueba();
		objprueba.setId(212);
		objprueba.setName("Dato de prueba");
		objprueba2.setId(2122);
		objprueba2.setName("Dato de prueba 2");
		lista.add(objprueba);
		lista.add(objprueba2);
		modelo.addAttribute("key", lista);
		return "Hola";
	}
	
}
