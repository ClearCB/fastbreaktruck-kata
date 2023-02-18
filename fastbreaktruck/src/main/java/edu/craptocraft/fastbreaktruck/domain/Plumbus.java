package edu.craptocraft.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.types.Cereales;

public class Plumbus extends Cereales{
    
    private final String NOMBRE = "Plumbus";
    private final Float PVP = 100f;

    public Plumbus() {
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

