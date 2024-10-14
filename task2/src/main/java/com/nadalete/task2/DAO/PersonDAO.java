package com.nadalete.task2.DAO;

import com.nadalete.task2.entity.Email;
import com.nadalete.task2.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class PersonDAO {
    public List<String> isValidToInclude(Person p) {
        List<String> errors = new ArrayList<>();

        // Validar nome
        if (!isValidName(p.getName())) {
            errors.add("Nome deve conter ao menos 2 partes e apenas letras.");
        }

        // Validar idade
        if (p.getAge() < 1 || p.getAge() > 200) {
            errors.add("Idade deve estar no intervalo de 1 a 200.");
        }

        // Validar Email associado
        if (p.getEmails() == null || p.getEmails().isEmpty()) {
            errors.add("Person deve ter pelo menos um Email associado.");
        } else {
            for (Email email : p.getEmails()) {
                if (!isValidEmail(email.getName())) {
                    errors.add("Formato de emails inválido: " + email.getName());
                }
            }
        }

        return errors;
    }

    private boolean isValidName(String name) {
        String[] parts = name.split(" ");
        if (parts.length < 2) {
            return false;
        }
        for (String part : parts) {
            if (!part.matches("[a-zA-Z]+")) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]+$";
        return Pattern.matches(emailRegex, email);
    }
}
