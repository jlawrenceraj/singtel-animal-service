package com.interview.singtel.animals.models;

import com.interview.singtel.animals.service.Transformable;

public class Caterpillar extends WalkingAnimal implements Transformable {

    @Override
    public Animal transform() {
        return new Butterfly();
    }
}
