package org.example.additionalTasks.AbstractAnimal;

import org.example.additionalTasks.AbstractAnimal.Animal;

public class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("Я поплыла");
    }
}