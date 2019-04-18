package com.john.inheritanceBetterTest;


import com.john.inheritanceBetter.Carnivore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class CarnivoreTest {

    private String food,sound;
    Carnivore carinore = new Carnivore();
    @Before
    public void setUp() throws Exception {
        food = "I eat meat";
        sound = null;
    }

    @Test
    public void canEat() {
        assertEquals(food,carinore.canEat("meat"));
        assertNotSame(food,carinore.canEat("meat"));
    }

    @Test
    public void makeSound(){
        assertEquals(sound,carinore.makeSound(null));
    }
}