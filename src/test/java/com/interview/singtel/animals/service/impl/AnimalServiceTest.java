package com.interview.singtel.animals.service.impl;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.interview.singtel.animals.service.Sing;
import com.interview.singtel.animals.service.Swim;
import com.interview.singtel.animals.service.Walk;

@SpringBootTest(classes = AnimalServiceImpl.class)
public class AnimalServiceTest {

    @Autowired
    private AnimalServiceImpl animalService;

    @Test
    public void test_animals_which_can_walk() {
        List<String> walkingAnimals = animalService.listAnimals(Walk.class);
        walkingAnimals.sort(String::compareTo);
        String[] animalNames = new String[]{"Cat", "Caterpillar", "Chicken", "Dog",
                "Duck", "Parrot living with Cat", "Parrot living with Dog",
                "Parrot living with Rooster", "Rooster",};

        Assertions.assertEquals(Arrays.asList(animalNames), walkingAnimals);
    }

    @Test
    public void test_count_animals_which_can_walk() {
        int count = animalService.count(Walk.class);
        Assertions.assertEquals(9, count);
    }

    @Test
    public void test_animals_which_can_swim() {
        List<String> walkingAnimals = animalService.listAnimals(Swim.class);
        walkingAnimals.sort(String::compareTo);
        String[] animalNames = new String[]{"ClownFish", "Dolphin", "Duck", "Shark"};

        Assertions.assertEquals(Arrays.asList(animalNames), walkingAnimals);
    }

    @Test
    public void test_animals_which_can_sing() {
        List<String> walkingAnimals = animalService.listAnimals(Sing.class);
        walkingAnimals.sort(String::compareTo);
        String[] animalNames = new String[]{"Parrot living with Cat", "Parrot living with Dog",
                "Parrot living with Rooster"};

        Assertions.assertEquals(Arrays.asList(animalNames), walkingAnimals);
    }
}
