package com.john.inheritance;

public class Lion extends Carnivore {

    @Override
    public String makeSound(String sound) {
        return "I " + sound;
    }
}