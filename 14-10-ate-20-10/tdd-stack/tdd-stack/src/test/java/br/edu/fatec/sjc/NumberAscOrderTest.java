package br.edu.fatec.sjc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

public class NumberAscOrderTest {

    private CustomStack<Integer> fullStack;
    private CustomStack<Integer> emptyStack;

    @BeforeEach
    public void setUp() {
        fullStack = new CustomStack<>(6, new IntegerCalculableStrategy());
        emptyStack = new CustomStack<>(6, new IntegerCalculableStrategy());

        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            try {
                fullStack.push(random.nextInt(100) + 1); // Números entre 1 e 100
            } catch (StackFullException e) {
                fail("A pilha está cheia, mas deveria aceitar 6 elementos");
            }
        }
    }

    @Test
    public void testSortWithFullStack() throws StackEmptyException {
        NumberAscOrder<Integer> numberAscOrder = new NumberAscOrder<>(fullStack);
        List<Integer> sortedNumbers = numberAscOrder.sort();
        assertEquals(6, sortedNumbers.size());
        for (int i = 0; i < sortedNumbers.size() - 1; i++) {
            assertTrue(sortedNumbers.get(i) <= sortedNumbers.get(i + 1));
        }
    }

    @Test
    public void testSortWithEmptyStack() throws StackEmptyException {
        NumberAscOrder<Integer> numberAscOrder = new NumberAscOrder<>(emptyStack);
        List<Integer> sortedNumbers = numberAscOrder.sort();
        assertTrue(sortedNumbers.isEmpty());
    }
}

