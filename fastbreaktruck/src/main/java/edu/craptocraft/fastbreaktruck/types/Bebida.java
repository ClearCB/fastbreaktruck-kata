package edu.craptocraft.fastbreaktruck.types;

import edu.craptocraft.fastbreaktruck.behaviour.Item;
import edu.craptocraft.fastbreaktruck.behaviour.Packing;
import edu.craptocraft.fastbreaktruck.domain.Tubo;

public abstract class Bebida implements Item{

    protected Bebida(){};

    @Override
    public Packing empaquetado() {
        return new Tubo();
    }

    @Override
    public String toString(){
        return this.outputFormat();
    }
    
    
}
