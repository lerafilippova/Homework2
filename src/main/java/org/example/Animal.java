package org.example;

public class Animal {
    public void move() {
    }
    public class Cat extends Animal {
        @Override
        public void move() {
            System.out.println("Я побежал");
        }
    }

    public class Fish extends Animal {
        @Override
        public void move() {
            System.out.println("Я поплыла");
        }
    }

    public class Duck extends Animal {
        @Override
        public void move() {
            System.out.println("Я полетела");
        }
    }
//    public static void main(String[] args) {
//        System.out.println(Animal.Cat);
//    }
}