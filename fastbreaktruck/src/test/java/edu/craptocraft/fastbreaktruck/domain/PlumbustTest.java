package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.fastbreaktruck.behaviour.Item;

public class PlumbustTest {

    public static Item plumbus;

    @BeforeClass
    public static void plumbusCreate(){
        plumbus = new Plumbus();

    }
    
    @Test
    public void constructorTest(){

        assertNotNull(plumbus);
        assertEquals("Item: Plumbus, Empaquetado: caja, P.V.P: 100.0", plumbus.toString());
    }

    
}
