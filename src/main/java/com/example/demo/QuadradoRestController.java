package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Quadrado;

@RestController
@RequestMapping("/quadrado")
public class QuadradoRestController {
	
	@GetMapping("/")
	public Quadrado calcularQuadrado(@RequestParam double lado) {
		return new Quadrado(lado);
	}
	
}
