package com.interview.singtel.animals.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.interview.singtel.animals.models.Butterfly;
import com.interview.singtel.animals.models.Cat;
import com.interview.singtel.animals.models.Caterpillar;
import com.interview.singtel.animals.models.Dog;
import com.interview.singtel.animals.models.Parrot;
import com.interview.singtel.animals.service.Sing;

import java.io.PrintStream;

import static org.mockito.ArgumentMatchers.matches;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AnimalCreationTest {


    @Test
    void test_dog_creation() {
        Dog dog = new Dog();
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        dog.sound();
        verify(out).println(matches("Woof, woof"));

        dog.walk();
        verify(out).println(matches("I am walking"));
    }

    @Test
    void test_parrot_with_dog_creation() {
        Parrot parrot = new Parrot(new Dog());
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        parrot.sing();
        verify(out).println(matches("Woof, woof"));

        parrot.walk();
        verify(out).println(matches("I am walking"));

        parrot.fly();
        verify(out).println(matches("I am flying"));
    }

    @Test
    void test_parrot_with_cat_creation() {
        Sing parrot = new Parrot(new Cat());
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        parrot.sing();
        verify(out).println(matches("Meow"));
    }

    @Test
    void test_caterpillar_transformation() {
        Caterpillar caterpillar = new Caterpillar();
        Assertions.assertEquals(Butterfly.class, caterpillar.transform().getClass());
    }
}
