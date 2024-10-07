package com.javarush.island.shirokova.api;

import com.javarush.island.shirokova.api.ability.Reproducible;

public abstract class Herbivore extends Animal implements Reproducible {
    public Herbivore(String name, double weight, int maxCountInCell, int speed,
                     double foodNeeded, double eatingProbability) {
        super(name, weight, maxCountInCell, speed, foodNeeded, eatingProbability);
    }

    @Override
    public void eat() {
        // Логика еды травоядного, например, поедание растений
    }

    @Override
    public void reproduce() {
        // Логика размножения
    }
}