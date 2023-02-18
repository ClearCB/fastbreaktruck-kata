package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.fastbreaktruck.behaviour.Item;

public class FleebJuiceTest {

    public static Item fleebJuice;

    @BeforeClass
    public static void fleebJuiceCreate(){
        fleebJuice = new FleebJuice();

    }
    
    @Test
    public void constructorTest(){

        assertNotNull(fleebJuice);
        assertEquals("Item: Fleeb Juice, Empaquetado: tubo, P.V.P: 1.5", fleebJuice.toString());
    }

    
}
