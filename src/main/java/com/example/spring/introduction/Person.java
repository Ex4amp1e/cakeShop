package com.example.spring.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("personBean")
@Scope
public class Person {
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
    public Person(/*@Qualifier ("catBean") */Pet pet) {
        System.out.println("Person bean is created with qualifier");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person bean is created");
    }

//    @Autowired
//    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("Class person: set pet");
        this.pet = pet;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {

        System.out.println("Class Person: set age");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void callYourPet() {
        System.out.println("Hello, pet!");
        pet.say();
    }
}
