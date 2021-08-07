package com.interview.singtel.animals.models;

import com.interview.singtel.animals.service.Sing;
import com.interview.singtel.animals.service.Sound;

public class Parrot extends FlyingBird implements Sing {
    private Sound livesWith;

    public Parrot(Sound livesWith) {
        this.livesWith = livesWith;
    }

    @Override
    public void sing() {
        livesWith.sound();
    }

    @Override
    public String getName() {
        return super.getName().concat(" living with ").concat(livesWith.getClass().getSimpleName());
    }
}
