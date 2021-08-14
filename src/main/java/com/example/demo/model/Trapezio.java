package com.example.demo.model;

/**
 * 
 * @author Bruno Bilheri Monteiro
 * 
 */

public class Trapezio extends Figura {

    private double base1;
    private double base2;
    private double altura;

    public Trapezio(double base1, double base2, double altura) {
        super();
        checkValue(base1);
        checkValue(base2);
        checkValue(altura);
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (base1 + base2) * altura / 2.0;
    }
}