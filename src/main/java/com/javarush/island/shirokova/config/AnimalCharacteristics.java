package com.javarush.island.shirokova.config;

/**
 * Represents the characteristics of animals.
 */
public class AnimalCharacteristics {
    private final double weight;
    private final int maxCountPerCell;
    private final int maxSpeed;
    private final int foodRequirement;
    private final double eatingProbability;

    /**
     * Constructs an AnimalCharacteristics instance.
     *
     * @param weight          the weight of the animal
     * @param maxCountPerCell the maximum amount of this species per cell
     * @param maxSpeed        the maximum speed of the animal
     * @param foodRequirement the amount of food the animal needs
     * @param eatingProbability the probability of eating when encountering food
     */
    public AnimalCharacteristics(double weight, int maxCountPerCell, int maxSpeed,
                                 int foodRequirement, double eatingProbability) {
        this.weight = weight;
        this.maxCountPerCell = maxCountPerCell;
        this.maxSpeed = maxSpeed;
        this.foodRequirement = foodRequirement;
        this.eatingProbability = eatingProbability;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxCountPerCell() {
        return maxCountPerCell;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getFoodRequirement() {
        return foodRequirement;
    }

    public double getEatingProbability() {
        return eatingProbability;
    }
}
