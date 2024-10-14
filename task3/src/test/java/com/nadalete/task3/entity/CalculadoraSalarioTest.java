package com.nadalete.task3.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSalarioTest {

    @Test
    public void deveCalcularSalarioDesenvolvedorComDescontoDe20PorCento() {
        Funcionario dev = new Funcionario("Lucas", "lucas@example.com", 4000.0, "DESENVOLVEDOR");
        CalculadoraSalario calculadora = new CalculadoraSalario();

        double salarioLiquido = calculadora.calcularSalarioLiquido(dev);

        assertEquals(3200.0, salarioLiquido, 0.001);
    }

    @Test
    public void deveCalcularSalarioDesenvolvedorComDescontoDe10PorCento() {
        Funcionario dev = new Funcionario("Lucas", "lucas@example.com", 2500.0, "DESENVOLVEDOR");
        CalculadoraSalario calculadora = new CalculadoraSalario();

        double salarioLiquido = calculadora.calcularSalarioLiquido(dev);

        assertEquals(2250.0, salarioLiquido, 0.001);
    }

    @Test
    public void deveCalcularSalarioDBAComDescontoDe25PorCento() {
        Funcionario dba = new Funcionario("Maria", "maria@example.com", 2500.0, "DBA");
        CalculadoraSalario calculadora = new CalculadoraSalario();

        double salarioLiquido = calculadora.calcularSalarioLiquido(dba);

        assertEquals(1875.0, salarioLiquido, 0.001);
    }

    @Test
    public void deveCalcularSalarioGerenteComDescontoDe30PorCento() {
        Funcionario gerente = new Funcionario("João", "joao@example.com", 6000.0, "GERENTE");
        CalculadoraSalario calculadora = new CalculadoraSalario();

        double salarioLiquido = calculadora.calcularSalarioLiquido(gerente);

        assertEquals(4200.0, salarioLiquido, 0.001);
    }

    @Test
    public void deveCalcularSalarioGerenteComDescontoDe20PorCento() {
        Funcionario gerente = new Funcionario("João", "joao@example.com", 4500.0, "GERENTE");
        CalculadoraSalario calculadora = new CalculadoraSalario();

        double salarioLiquido = calculadora.calcularSalarioLiquido(gerente);

        assertEquals(3600.0, salarioLiquido, 0.001);
    }
}