package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.fastbreaktruck.behaviour.Item;

public class TurbulentJuiceTest {
    public static Item juice;

    @BeforeClass
    public static void eyeholesCreate(){
        juice = new TurbulentJuice();

    }
    
    @Test
    public void constructorTest(){

        assertNotNull(juice);
        assertEquals("Item: Turbulent Juice, Empaquetado: tubo, P.V.P: 1.0", juice.toString());
    }

}
