package edu.craptocraft.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.types.Cereales;

public class Eyeholes extends Cereales {
    private final String NOMBRE = "Eyeholes";
    private final Float PVP = 2.5f;

    public Eyeholes() {
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
