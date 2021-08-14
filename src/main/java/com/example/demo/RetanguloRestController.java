package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Retangulo;

@RestController
@RequestMapping("/retangulo")
public class RetanguloRestController {
	
	@GetMapping("/")
	public String calculaArea(@RequestParam double base, double altura) {
		Retangulo r1 = new Retangulo(base, altura);
		return "Calculo da area do retangulo: "+ r1.getArea();
	}
}
