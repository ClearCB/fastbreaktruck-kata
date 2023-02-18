package edu.craptocraft.fastbreaktruck.domain;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.fastbreaktruck.behaviour.Item;

public class Desayuno {
    private Float total;
    private List<Item> items = new ArrayList<Item>();

    Desayuno(){
        // Evitar problemas
        this.total = 0f;
    }

    public List<Item> getItems(){
        return this.items;
    }

    public Float getCoste(){
        return this.total;
    }

    private void setCoste(Item producto){
        this.total += producto.pvp();
    }

    public void addItem(Item producto){
        this.getItems().add(producto);
        this.setCoste(producto);
    }
    
}
