package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Triangulo;

@RestController
@RequestMapping("/triangulo")
public class TrianguloRestController {
	
	@GetMapping("/")
	public Triangulo calculaArea(@RequestParam double base, double altura) {
		return new Triangulo(base, altura);
	}
}
