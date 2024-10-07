package com.javarush.island.shirokova.api;

import com.javarush.island.shirokova.api.ability.*;
import com.javarush.island.shirokova.config.AnimalCharacteristics;

public abstract class Animal implements Creature, Eating, Movable {

    protected AnimalCharacteristics characteristics;

    public Animal(AnimalCharacteristics characteristics) {
        this.characteristics = characteristics;
    }

    public Animal(String name, double weight, int maxCountPerCell,
                  int maxSpeed, double foodNeeded, double eatingProbability) {
        this.characteristics = new AnimalCharacteristics(name, weight, maxCountPerCell,
                maxSpeed, foodNeeded, eatingProbability);
    }

    @Override
    public abstract void eat();

    @Override
    public abstract void reproduce();

    @Override
    public void move() {
    }

    @Override
    public void die() {
        System.out.println(this.characteristics.getName() + " die.");
    }
}