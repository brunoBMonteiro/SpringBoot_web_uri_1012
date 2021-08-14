package com.example.demo.model;

/**
 * 
 * @author  Bruno Bilheri Monteiro
 * 
 */

public class Quadrado extends Figura {

    private double lado;

    public Quadrado(double lado) {
        super();
        checkValue(lado);
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }
}