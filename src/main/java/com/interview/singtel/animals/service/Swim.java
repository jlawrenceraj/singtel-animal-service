package com.interview.singtel.animals.service;

public interface Swim extends Activities {
    default void swim() {
        System.out.println("I am swimming");
    }
}
