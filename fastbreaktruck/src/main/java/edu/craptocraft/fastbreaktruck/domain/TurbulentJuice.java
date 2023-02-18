package edu.craptocraft.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.types.Bebida;

public class TurbulentJuice extends Bebida{

    private final String NOMBRE = "Turbulent Juice";
    private final Float PVP = 1.0f;

    public TurbulentJuice() {
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