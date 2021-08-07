package com.interview.singtel.animals.models;

public class Shark extends Fish {

    public Shark() {
        super("Large", "Grey");
    }

    @Override
    public void action() {
        System.out.println("I eat fish");
    }
}
