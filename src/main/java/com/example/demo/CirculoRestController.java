package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Circulo;

@RestController
@RequestMapping("/circulo")
public class CirculoRestController {
	
	@GetMapping("/")
	public String calculaArea(@RequestParam double raio) {
		Circulo c1 = new Circulo(raio);
		return "calculo da area do circulo:"+c1.getArea();
	}
	
}
