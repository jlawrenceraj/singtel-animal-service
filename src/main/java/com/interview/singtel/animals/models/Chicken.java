package com.interview.singtel.animals.models;

import com.interview.singtel.animals.service.Sound;

public class Chicken extends WalkingAnimal implements Sound {

    @Override
    public void sound() {
        System.out.println("Cluck, cluck");
    }

}
