package com.interview.singtel.animals.models;

import com.interview.singtel.animals.service.Sound;
import com.interview.singtel.animals.service.Swim;

public class Duck extends FlyingBird implements Sound, Swim {

    @Override
    public void sound() {
        System.out.println("Quack, quack");
    }
}
