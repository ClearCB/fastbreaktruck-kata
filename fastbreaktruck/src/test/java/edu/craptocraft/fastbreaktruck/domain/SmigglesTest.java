package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.fastbreaktruck.behaviour.Item;

public class SmigglesTest {

    public static Item smiggles;

    @BeforeClass
    public static void fleebJuiceCreate(){
        smiggles = new Smiggles();

    }
    
    @Test
    public void constructorTest(){

        assertNotNull(smiggles);
        assertEquals("Item: Smiggles, Empaquetado: caja, P.V.P: 3.5", smiggles.toString());
    }

    
}
