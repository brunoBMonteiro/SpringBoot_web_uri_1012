package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Trapezio;

@RestController
@RequestMapping("/trapezio")

public class TrapezioRestController {
	@GetMapping("/")
	public String calculaArea(@RequestParam double base1, double base2, double altura ) {
		Trapezio t1 = new Trapezio(base1 , base2, altura);
		return "Calcula do Trapezio :" + t1.getArea();
		
	}
}
