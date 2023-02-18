package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.fastbreaktruck.behaviour.Item;

public class EyeholesTest {
    public static Item eyeholes;

    @BeforeClass
    public static void eyeholesCreate(){
        eyeholes = new Eyeholes();

    }
    
    @Test
    public void constructorTest(){

        assertNotNull(eyeholes);
        assertEquals("Item: Eyeholes, Empaquetado: caja, P.V.P: 2.5", eyeholes.toString());
    }

    
}
