package com.example.demo.model;

/**
 * 
 * @author  Bruno Bilheri Monteiro
 * 
 */

public class Retangulo extends Figura {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super();
        checkValue(altura);
        checkValue(base);
        this.base = base;
        this.altura = altura;
    };

    @Override
    public double getArea() {
        return base * altura;
    }

}
