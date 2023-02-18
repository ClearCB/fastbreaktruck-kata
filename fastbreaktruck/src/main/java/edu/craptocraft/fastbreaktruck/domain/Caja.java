package edu.craptocraft.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.behaviour.Packing;

public class Caja implements Packing{
    private String envoltorio = "caja";

    public Caja(){
        // Vacio para evitar futuros problemas
    };
    
    @Override
    public String envoltorio() {
        return this.envoltorio;
    }

}
