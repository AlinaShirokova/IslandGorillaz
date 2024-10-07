package com.javarush.island.shirokova.api;

import com.javarush.island.shirokova.api.ability.Mortal;
import com.javarush.island.shirokova.api.ability.Reproducible;

public interface Creature extends Reproducible, Mortal {
    @Override
    void reproduce();

    @Override
    void die();
}
