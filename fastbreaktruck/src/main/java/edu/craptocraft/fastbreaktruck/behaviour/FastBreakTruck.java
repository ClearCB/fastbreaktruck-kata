package edu.craptocraft.fastbreaktruck.behaviour;

import edu.craptocraft.fastbreaktruck.domain.Desayuno;
import edu.craptocraft.fastbreaktruck.domain.Eyeholes;
import edu.craptocraft.fastbreaktruck.domain.TurbulentJuice;

public class FastBreakTruck {

    private FastBreakTruck(){}

    public static Desayuno prepararEyeHoles(){
        
        Desayuno nuevoDesayuno = new Desayuno();
        nuevoDesayuno.addItem(new Eyeholes());
        nuevoDesayuno.addItem(new TurbulentJuice());

        return nuevoDesayuno;

    }
}
