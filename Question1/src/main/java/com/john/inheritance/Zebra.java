package com.john.inheritance;

public class Zebra extends Herbivore {

    @Override
    public String makeSound(String sound) {
        return "I " + sound;
    }
}