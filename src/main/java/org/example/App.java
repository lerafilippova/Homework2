package org.example;

import org.example.additionalTasks.AbstractAnimal.Cat;
import org.example.additionalTasks.AbstractAnimal.Duck;
import org.example.additionalTasks.AbstractAnimal.Fish;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Fish fish = new Fish();
        Duck duck = new Duck();

        cat.move();
        fish.move();
        duck.move();
    }
}