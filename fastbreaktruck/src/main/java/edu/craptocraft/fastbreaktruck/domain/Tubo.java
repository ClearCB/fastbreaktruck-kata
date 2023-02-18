package edu.craptocraft.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.behaviour.Packing;

public class Tubo implements Packing{
    private String envoltorio = "tubo";

    public Tubo(){
        // Vacio para evitar futuros problemas
    };
    
    @Override
    public String envoltorio() {
        return this.envoltorio;
    }

}
