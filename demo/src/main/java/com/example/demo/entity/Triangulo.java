package com.example.demo.entity;

public class Triangulo {
    private Integer lado1;
    private Integer lado2;
    private Integer lado3;

    public Triangulo(Integer lado1, Integer lado2, Integer lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    private boolean eTriangulo() {
        return (lado1 > 0 && lado2 > 0 && lado3 > 0) &&
                (lado1 + lado2 > lado3) &&
                (lado1 + lado3 > lado2) &&
                (lado2 + lado3 > lado1);
    }

    public String tipoDeTriangulo() {
        if (!eTriangulo()) {
            return "Os lados fornecidos não formam um triângulo.";
        }
        if (lado1.equals(lado2) && lado2.equals(lado3)) {
            return "Triângulo Equilátero";
        } else if (lado1.equals(lado2) || lado1.equals(lado3) || lado2.equals(lado3)) {
            return "Triângulo Isósceles";
        } else {
            return "Triângulo Escaleno";
        }
    }

    public Integer getLado1() {
        return lado1;
    }

    public void setLado1(Integer lado1) {
        this.lado1 = lado1;
    }

    public Integer getLado2() {
        return lado2;
    }

    public void setLado2(Integer lado2) {
        this.lado2 = lado2;
    }

    public Integer getLado3() {
        return lado3;
    }

    public void setLado3(Integer lado3) {
        this.lado3 = lado3;
    }
}

