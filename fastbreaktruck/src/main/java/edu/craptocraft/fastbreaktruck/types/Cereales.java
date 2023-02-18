package edu.craptocraft.fastbreaktruck.types;

import edu.craptocraft.fastbreaktruck.behaviour.Item;
import edu.craptocraft.fastbreaktruck.behaviour.Packing;
import edu.craptocraft.fastbreaktruck.domain.Caja;

public abstract class Cereales implements Item{

    protected Cereales(){};

    @Override
    public Packing empaquetado() {
        return new Caja();
    }

    @Override
    public String toString(){
        return this.outputFormat();
    }
    
}
