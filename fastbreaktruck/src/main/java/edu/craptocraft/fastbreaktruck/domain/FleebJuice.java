package edu.craptocraft.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.types.Bebida;

public class FleebJuice extends Bebida {
    private final String NOMBRE = "Fleeb Juice";
    private final Float PVP = 1.5f;

    public FleebJuice() {
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
