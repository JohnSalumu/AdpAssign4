package com.john.inheritance;

public class Carnivore extends Animal {

    @Override
    public String canEat(String eat) {
        return "I eat " + eat;
    }
}