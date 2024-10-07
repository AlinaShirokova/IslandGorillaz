package com.javarush.island.shirokova.api;

import com.javarush.island.shirokova.config.AnimalCharacteristics;

public abstract class Carnivore extends Animal {
    public Carnivore(AnimalCharacteristics animalCharacteristics) {
        super(animalCharacteristics);
    }

    @Override
    public void eat() {
    }
}