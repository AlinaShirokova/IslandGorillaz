package com.javarush.island.shirokova.entity.organisms;

import com.javarush.island.shirokova.config.AnimalCharacteristics;

/**
 * Represents a Wolf with defined characteristics.
 */
public class Wolf extends Predator {
    private final AnimalCharacteristics characteristics;

    /**
     * Constructs a Wolf instance.
     *
     * @param characteristics the characteristics of the wolf
     */
    public Wolf(AnimalCharacteristics characteristics) {
        this.characteristics = characteristics;
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

    // Further methods to utilize `characteristics` fields can be added
}