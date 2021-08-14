package com.example.demo.model;

public abstract class Figura {

    public Figura() {
        super();
    }

    public abstract double getArea();

    public static void checkValue(double value) {
        if (value <= 0.0) {
            throw new IllegalArgumentException();
        }
    }

}