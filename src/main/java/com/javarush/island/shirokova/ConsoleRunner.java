package com.javarush.island.shirokova;

import com.javarush.island.shirokova.config.AnimalCharacteristics;
import com.javarush.island.shirokova.config.SimulationParameters;
import com.javarush.island.shirokova.entity.Island;
import com.javarush.island.shirokova.entity.Simulation;
import com.javarush.island.shirokova.entity.organisms.Wolf;

public class ConsoleRunner {
    public static void main(String[] args) {


        Island island = new Island(SimulationParameters.ISLAND_WIDTH, SimulationParameters.ISLAND_HEIGHT);
        Simulation simulation = new Simulation(island);
        simulation.start();

        // Остановка симуляции по некоторым условиям


        AnimalCharacteristicsRepository repository = new AnimalCharacteristicsRepository();
        repository.loadFromCSV("entity_characteristics.csv");

        AnimalCharacteristics wolfCharacteristics = repository.getCharacteristics("Wolf");
        Wolf wolf = new Wolf(wolfCharacteristics);
    }
}
