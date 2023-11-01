package org.example.additionalTasks.AbstractAnimal;

import org.example.additionalTasks.AbstractAnimal.Animal;

public class Duck extends Animal {
    @Override
    public void move() {
        System.out.println("Я полетела");
    }
}