package com.nadalete.task3.entity;

public class CalculadoraSalario {

    public double calcularSalarioLiquido(Funcionario funcionario) {
        double salarioBase = funcionario.getSalarioBase();
        String cargo = funcionario.getCargo();

        switch (cargo.toUpperCase()) {
            case "DESENVOLVEDOR":
                return salarioBase >= 3000 ? salarioBase * 0.80 : salarioBase * 0.90;

            case "DBA":
            case "TESTADOR":
                return salarioBase >= 2000 ? salarioBase * 0.75 : salarioBase * 0.85;

            case "GERENTE":
                return salarioBase >= 5000 ? salarioBase * 0.70 : salarioBase * 0.80;

            default:
                throw new IllegalArgumentException("Cargo inválido!");
        }
    }
}

