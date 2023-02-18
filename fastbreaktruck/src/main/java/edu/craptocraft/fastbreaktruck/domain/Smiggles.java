package edu.craptocraft.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.types.Cereales;

public class Smiggles extends Cereales{
    
    private final String NOMBRE = "Smiggles";
    private final Float PVP = 3.5f;

    public Smiggles() {
        // Evitar futuros problemas
    }

    @Override
    public String nombre() {
        return this.NOMBRE;
    }

    public Float pvp() {
        return this.PVP;
    }

}
