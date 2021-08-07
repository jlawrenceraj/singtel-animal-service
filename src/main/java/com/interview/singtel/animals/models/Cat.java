package com.interview.singtel.animals.models;

import com.interview.singtel.animals.service.Sound;

public class Cat extends WalkingAnimal implements Sound {

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
