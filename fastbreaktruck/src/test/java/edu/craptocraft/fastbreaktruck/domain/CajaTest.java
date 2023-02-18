package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

public class CajaTest {
    public static Caja caja;

    @BeforeClass
    public static void createCaja() {
        caja = new Caja();

    }

    @Test
    public void constructorTest() {

        assertNotNull(caja);
    }

    @Test
    public void envoltorioTest() {

        assertEquals("caja", caja.envoltorio());
    }
}
