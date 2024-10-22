package br.edu.fatec.sjc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberAscOrder<T extends Number> {
    private CustomStack<T> customStack;

    public NumberAscOrder(CustomStack<T> customStack) {
        this.customStack = customStack;
    }

    public List<T> sort() throws StackEmptyException {
        List<T> sortedNumbers = new ArrayList<>();

        while (!customStack.isEmpty()) {
            sortedNumbers.add(customStack.pop());
        }

        Collections.sort(sortedNumbers, (n1, n2) -> Double.compare(n1.doubleValue(), n2.doubleValue()));

        return sortedNumbers;
    }
}
