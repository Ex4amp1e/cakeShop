package com.example.spring.introduction;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet {

//    private String name;

    public Cat() {
        System.out.println("Cat bean is created");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }

}
