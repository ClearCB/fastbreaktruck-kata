package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

public class DesayunoTest {
    public static Desayuno desayuno;

    @BeforeClass
    public static void desayunoCrear(){
        desayuno = new Desayuno();

    }

    @Test
    public void constructorTest(){
        assertNotNull(desayuno);

    }

    @Test
    public void itemsTest(){

        // Get items
        assertNotNull(desayuno.getItems());

        // Add item
        assertEquals(0,desayuno.getItems().size());
        Eyeholes eyehole = new Eyeholes();
        desayuno.addItem(eyehole);
        assertEquals(1,desayuno.getItems().size());

    }

    @Test
    public void getCosteTotalTest(){

        assertEquals(2.5, desayuno.getCoste(),0);
    }
}
