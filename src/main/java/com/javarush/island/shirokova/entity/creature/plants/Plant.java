package com.javarush.island.shirokova.entity.creature.plants;

import com.javarush.island.shirokova.api.Creature;

public class Plant implements Creature {
    private String name;
    private double weight;

    public Plant(String name) {
        this.name = name;
        this.weight = 1; // Вес по умолчанию
    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {
        // Логика обработки смерти растения
        System.out.println(name + " погибло.");
    }
}