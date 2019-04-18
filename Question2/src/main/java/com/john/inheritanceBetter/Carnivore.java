package com.john.inheritanceBetter;

public class Carnivore implements Animal {

    @Override
    public String makeSound(String sound) {
        return null;
    }

    @Override
    public String canEat(String eat) {
        return "I eat " + eat;
    }
}
