package com.interview.singtel.animals.service;

public interface Fly extends Activities {

    default void fly() {
        System.out.println("I am flying");
    }
}
