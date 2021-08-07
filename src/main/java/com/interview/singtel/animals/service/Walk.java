package com.interview.singtel.animals.service;

public interface Walk extends Activities {
    default void walk() {
        System.out.println("I am walking");
    }
}
