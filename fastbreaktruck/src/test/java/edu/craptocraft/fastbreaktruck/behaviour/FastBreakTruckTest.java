package edu.craptocraft.fastbreaktruck.behaviour;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.craptocraft.fastbreaktruck.domain.Desayuno;

public class FastBreakTruckTest {

    @Test
    public void prepararEyeHolesTest(){

        Desayuno eyeholes = FastBreakTruck.prepararEyeHoles();
        assertNotNull(eyeholes);
        assertEquals(2, eyeholes.getItems().size());

    }

    @Test
    public void prepararSmigglesTest(){

        Desayuno smiggles = FastBreakTruck.prepararSmiggles();
        assertNotNull(smiggles);
        assertEquals(2, smiggles.getItems().size());

    }

    @Test
    public void incluirJugueteTest(){

        Desayuno eyeholes = FastBreakTruck.prepararEyeHoles();
        assertNotNull(eyeholes);
        FastBreakTruck.incluirJuguete(eyeholes);
        assertEquals(3, eyeholes.getItems().size());


    }

}
