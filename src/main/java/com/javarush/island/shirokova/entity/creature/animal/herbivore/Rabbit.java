package com.javarush.island.shirokova.entity.creature.animal.herbivore;

import com.javarush.island.shirokova.api.Herbivore;

public class Rabbit extends Herbivore {
    public Rabbit() {
        super("Кролик", 2, 150, 2, 0.45, 0.6);
    }

    @Override
    public void eat() {
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void setLocation(int x, int y) {
    }
}