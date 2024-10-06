package com.javarush.island.shirokova;

import com.javarush.island.shirokova.config.AnimalCharacteristics;

import java.util.HashMap;
import java.util.Map;

/**
 * Repository for loading animal characteristics from a CSV file.
 */
public class AnimalCharacteristicsRepository {
    private final Map<String, AnimalCharacteristics> characteristicsMap = new HashMap<>();

    /**
     * Loads animal characteristics from a CSV file.
     *
     * @param filePath the path to the CSV file
     */
    public void loadFromCSV(String filePath) {
        //TODO
    }

    /**
     * Retrieves characteristics for a given species.
     *
     * @param species the species name
     * @return the characteristics of the species
     */
    public AnimalCharacteristics getCharacteristics(String species) {
        return characteristicsMap.get(species);
    }
}
