package com.javarush.island.shirokova.config;

/**
 * Represents the characteristics of animals.
 */
public class AnimalCharacteristics {
    protected String name;
    private final double weight;
    private final int maxCountPerCell;
    private final int maxSpeed;
    private final double foodRequirement;
    private final double eatingProbability; //todo array?

    /**
     * Constructs an AnimalCharacteristics instance.
     *
     * @param weight          the weight of the animal
     * @param maxCountPerCell the maximum amount of this species per cell
     * @param maxSpeed        the maximum speed of the animal
     * @param foodRequirement the amount of food the animal needs
     * @param eatingProbability the probability of eating when encountering food
     */
    public AnimalCharacteristics(String name, double weight, int maxCountPerCell, int maxSpeed,
                                 double foodRequirement, double eatingProbability) {
        this.name = name;
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

    public double getFoodRequirement() {
        return foodRequirement;
    }

    public double getEatingProbability() {
        return eatingProbability;
    }

    public String getName() {
        return name;
    }
}
