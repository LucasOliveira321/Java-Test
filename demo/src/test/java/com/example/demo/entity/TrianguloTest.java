package com.example.demo.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TrianguloTest {

    @Test
    public void testTrianguloEquilatero() {
        Triangulo triangulo = new Triangulo(3, 3, 3);
        assertEquals("Triângulo Equilátero", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testTrianguloIsosceles() {
        Triangulo triangulo = new Triangulo(5, 5, 3);
        assertEquals("Triângulo Isósceles", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testTrianguloEscaleno() {
        Triangulo triangulo = new Triangulo(4, 5, 6);
        assertEquals("Triângulo Escaleno", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testNaoFormaTrianguloZero() {
        Triangulo triangulo = new Triangulo(0, 2, 3);
        assertEquals("Os lados fornecidos não formam um triângulo.", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testNaoFormaTrianguloNegativo() {
        Triangulo triangulo = new Triangulo(-1, 2, 3);
        assertEquals("Os lados fornecidos não formam um triângulo.", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testNaoFormaTrianguloSomaIgualTerceiro() {
        Triangulo triangulo = new Triangulo(1, 2, 3);
        assertEquals("Os lados fornecidos não formam um triângulo.", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testNaoFormaTrianguloPermutacao1() {
        Triangulo triangulo = new Triangulo(2, 3, 1);
        assertEquals("Os lados fornecidos não formam um triângulo.", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testNaoFormaTrianguloPermutacao2() {
        Triangulo triangulo = new Triangulo(3, 1, 2);
        assertEquals("Os lados fornecidos não formam um triângulo.", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testSomaDoisLadosMenorTerceiro() {
        Triangulo triangulo = new Triangulo(1, 1, 3);
        assertEquals("Os lados fornecidos não formam um triângulo.", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testSomaDoisLadosMenorPermutacao1() {
        Triangulo triangulo = new Triangulo(3, 1, 1);
        assertEquals("Os lados fornecidos não formam um triângulo.", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testSomaDoisLadosMenorPermutacao2() {
        Triangulo triangulo = new Triangulo(1, 3, 1);
        assertEquals("Os lados fornecidos não formam um triângulo.", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testTodosLadosZero() {
        Triangulo triangulo = new Triangulo(0, 0, 0);
        assertEquals("Os lados fornecidos não formam um triângulo.", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testIsoscelesPermutacao1() {
        Triangulo triangulo = new Triangulo(5, 3, 5);
        assertEquals("Triângulo Isósceles", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testIsoscelesPermutacao2() {
        Triangulo triangulo = new Triangulo(3, 5, 5);
        assertEquals("Triângulo Isósceles", triangulo.tipoDeTriangulo());
    }

    @Test
    public void testIsoscelesPermutacao3() {
        Triangulo triangulo = new Triangulo(5, 5, 3);
        assertEquals("Triângulo Isósceles", triangulo.tipoDeTriangulo());
    }
}
