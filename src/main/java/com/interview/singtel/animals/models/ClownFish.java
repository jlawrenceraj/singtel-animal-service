package com.interview.singtel.animals.models;

public class ClownFish extends Fish {

    public ClownFish() {
        super("Small", "Orange");
    }

    @Override
    public void action() {
        System.out.println("I make jokes");
    }
}
