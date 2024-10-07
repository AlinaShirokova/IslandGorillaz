package com.javarush.island.shirokova.entity.creature.animal.carnivore;

import com.javarush.island.shirokova.api.Carnivore;
import com.javarush.island.shirokova.config.AnimalCharacteristics;

/**
 * Represents a Wolf with defined characteristics.
 */
public class Wolf extends Carnivore {
    private AnimalCharacteristics characteristics;

    /**
     * Constructs a Wolf instance.
     *
     * @param characteristics the characteristics of the wolf
     */
    public Wolf(AnimalCharacteristics characteristics) {
        super(characteristics);
    }

    /**
     * Simulates the wolf attempting to eat a specified prey.
     *
     * @param prey the prey species name
     */
    public void eat(String prey) {
        double probability = characteristics.getEatingProbability();
        if (Math.random() < probability) {
            System.out.println("Wolf eats " + prey + "!");
            // Logic for consuming the prey
        } else {
            System.out.println("Wolf failed to eat " + prey + ".");
        }
    }

    @Override
    public void reproduce() {
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

    // Further methods to utilize `characteristics` fields can be added
}