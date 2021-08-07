package com.interview.singtel.animals.models;

import com.interview.singtel.animals.service.Sound;

public class Dog extends WalkingAnimal implements Sound {

    @Override
    public void sound() {
        System.out.println("Woof, woof");
    }
}
