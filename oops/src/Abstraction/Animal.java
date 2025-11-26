package Abstraction;

abstract class Ani {
    abstract void sound();  // abstract method
    
    public void sleep() {    // concrete method
        System.out.println("sleeppppppppp");
    }
}

class Dog extends Ani {
    void sound() {
        System.out.println("barkkkkkkkkkkkkkkkkkkkk");
    }
}

class Cat extends Ani {
    void sound() {
        System.out.println("Meowwwwwwwwwwwww");
    }
}

public class Animal {
    public static void main(String[] args) {
        Ani a1 = new Cat();
        Ani a2 = new Dog();

        a1.sound();  // Meow from Cat
        a1.sleep();  // sleep from Animal

        a2.sound();  // bark from Dog
        a2.sleep();  // sleep from Animal
    }
}
