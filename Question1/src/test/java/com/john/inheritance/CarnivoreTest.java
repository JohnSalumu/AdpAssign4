package com.john.inheritance;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarnivoreTest {

    private String food;
    Carnivore carinore = new Carnivore();
    @Before
    public void setUp() throws Exception {
        food = "I eat meat";
    }

    @Test
    public void canEat() {
        assertEquals(food,carinore.canEat("meat"));
        assertNotSame(food,carinore.canEat("meat"));
    }
}