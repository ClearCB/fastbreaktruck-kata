package edu.craptocraft.fastbreaktruck.behaviour;

import java.util.Formatter;

public interface Item {
    
    String nombre();

    Packing empaquetado();

    Float pvp();

    default String outputFormat(){
        StringBuilder information = new StringBuilder();
        Formatter formatter = new Formatter(information);

        // IMPORTANTE: esto lo he aprendido mirando el código de David, útil para formatear strings.
        formatter.format("Item: %1$s, Empaquetado: %2$s, P.V.P: %3$s",
                        this.nombre(), this.empaquetado().envoltorio(), this.pvp());
        formatter.close();

        return information.toString();
    }
}
