package com.nadalete.task2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;
    public int age;
    @OneToMany
    public List<Email> emails;

    public Person(String name, int age, List<Email> emails) {
        this.name = name;
        this.age = age;
        this.emails = emails;
    }
}
