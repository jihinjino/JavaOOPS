package com.Inheritance;

class Animal {
    String name;
    String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(name + " says " + sound);
    }
}

class Dog extends Animal {
    public Dog(String name, String sound) {
        super(name, sound);
    }

    public void bark() {
        System.out.println("Boww!");
    }
}

public class AnimalInheritance {
    public static void main(String[] args) {
        Dog fido = new Dog("Tinu", "Bowww");
        fido.makeSound();
        fido.bark(); 
    }
}