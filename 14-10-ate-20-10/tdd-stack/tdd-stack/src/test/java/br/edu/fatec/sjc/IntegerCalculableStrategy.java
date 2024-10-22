package br.edu.fatec.sjc;

public class IntegerCalculableStrategy implements CalculableStrategy<Integer> {
    @Override
    public Integer calculateValue(Integer element) {
        return element;
    }
}