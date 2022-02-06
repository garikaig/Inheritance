package com.ggwaradzimba;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1,5,5);
        Dog dog = new Dog("Yorkie", 8, 20,2,4,1,20,"long silky");

        dog.eat();
        dog.walk();

        Fish fish = new Fish("Salmon",1,3,2,2,2,2,2);
        fish.move(6);
    }
}
