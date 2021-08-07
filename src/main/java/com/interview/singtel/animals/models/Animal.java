package com.interview.singtel.animals.models;

public interface Animal {
    default String getName() {
        return this.getClass().getSimpleName();
    }
}
