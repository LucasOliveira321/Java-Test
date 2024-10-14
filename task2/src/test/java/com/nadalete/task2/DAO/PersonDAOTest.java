package com.nadalete.task2.DAO;

import static org.junit.jupiter.api.Assertions.*;

import com.nadalete.task2.entity.Email;
import com.nadalete.task2.entity.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class PersonDAOTest {

    private PersonDAO personDAO;

    @BeforeEach
    public void setup() {
        personDAO = new PersonDAO();
    }

    @Test
    public void testNomeInvalido() {
        Person person = new Person("Joao", 25, Arrays.asList(new Email("joao@exemplo.com")));
        List<String> errors = personDAO.isValidToInclude(person);
        assertTrue(errors.contains("Nome deve conter ao menos 2 partes e apenas letras."));
    }

    @Test
    public void testIdadeInvalida() {
        Person person = new Person("Joao Silva", 201, Arrays.asList(new Email("joao@exemplo.com")));
        List<String> errors = personDAO.isValidToInclude(person);
        assertTrue(errors.contains("Idade deve estar no intervalo de 1 a 200."));
    }

    @Test
    public void testEmailInvalido() {
        Person person = new Person("Joao Silva", 30, Arrays.asList(new Email("joaoexemplo.com")));
        List<String> errors = personDAO.isValidToInclude(person);
        assertFalse(errors.contains("Formato de email inválido: joaoexemplo.com"));
    }

    @Test
    public void testPersonSemEmail() {
        Person person = new Person("Joao Silva", 30, null);
        List<String> errors = personDAO.isValidToInclude(person);
        assertTrue(errors.contains("Person deve ter pelo menos um Email associado."));
    }

    @Test
    public void testValidPerson() {
        Person person = new Person("Joao Silva", 30, Arrays.asList(new Email("joao@exemplo.com")));
        List<String> errors = personDAO.isValidToInclude(person);
        assertTrue(errors.isEmpty());
    }
}
