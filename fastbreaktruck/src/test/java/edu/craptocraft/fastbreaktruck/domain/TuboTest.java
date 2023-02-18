package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

public class TuboTest {
    public static Tubo tubo;

    @BeforeClass
    public static void createTubo(){
        tubo = new Tubo();

    }

    @Test
    public void constructorTest(){

        assertNotNull(tubo);
    }

    @Test
    public void envoltorioTest(){

        assertEquals("tubo", tubo.envoltorio());
    }
}
