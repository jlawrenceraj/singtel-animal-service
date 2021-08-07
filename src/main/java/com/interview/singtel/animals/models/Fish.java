package com.interview.singtel.animals.models;

import com.interview.singtel.animals.service.FishAction;
import com.interview.singtel.animals.service.Swim;

public abstract class Fish implements Animal, Swim, FishAction {
    private String size;
    private String colour;

    public Fish(String size, String colour) {
        this.size = size;
        this.colour = colour;
    }
}
