package edu.craptocraft.fastbreaktruck.behaviour;

import edu.craptocraft.fastbreaktruck.domain.Desayuno;
import edu.craptocraft.fastbreaktruck.domain.Eyeholes;
import edu.craptocraft.fastbreaktruck.domain.FleebJuice;
import edu.craptocraft.fastbreaktruck.domain.Plumbus;
import edu.craptocraft.fastbreaktruck.domain.Smiggles;
import edu.craptocraft.fastbreaktruck.domain.TurbulentJuice;

public class FastBreakTruck {

    private FastBreakTruck(){}

    public static Desayuno prepararEyeHoles(){
        
        Desayuno nuevoDesayuno = new Desayuno();
        nuevoDesayuno.addItem(new Eyeholes());
        nuevoDesayuno.addItem(new TurbulentJuice());

        return nuevoDesayuno;

    }

    public static Desayuno prepararSmiggles(){
        
        Desayuno nuevoDesayuno = new Desayuno();
        nuevoDesayuno.addItem(new Smiggles());
        nuevoDesayuno.addItem(new FleebJuice());

        return nuevoDesayuno;

    }

    public static void incluirJuguete(Desayuno desayuno){

        desayuno.addItem(new Plumbus());

    }
}
