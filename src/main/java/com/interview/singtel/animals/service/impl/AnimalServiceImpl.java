package com.interview.singtel.animals.service.impl;

import org.springframework.stereotype.Service;

import com.interview.singtel.animals.models.*;
import com.interview.singtel.animals.service.Activities;
import com.interview.singtel.animals.service.AnimalService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalServiceImpl implements AnimalService {

    private List<Animal> animals;

    @PostConstruct
    void init() {
        animals = new ArrayList<>();
        Animal[] animalTypes = new Animal[]{
                new Cat(),
                new Dog(),
                new Butterfly(),
                new Caterpillar(),
                new Chicken(),
                new Rooster(),
                new ClownFish(),
                new Dolphin(),
                new Duck(),
                new Parrot(new Dog()),
                new Parrot(new Cat()),
                new Parrot(new Rooster()),
                new Shark()
        };
        animals.addAll(Arrays.asList(animalTypes));
    }

    @Override
    public int count(Class<? extends Activities> activity) {
        return (int) animals.stream().filter(activity::isInstance).count();
    }

    @Override
    public List<String> listAnimals(Class<? extends Activities> activity) {
        return animals.stream().filter(activity::isInstance).map(Animal::getName)
                .collect(Collectors.toList());
    }
    
    @Override
    public List<String> listAnimals() {
    	return animals.stream().map(Animal::getName).collect(Collectors.toList());
    }
    

}
