package com.javarush.island.shirokova.api.ability;

public interface Movable {
    void move();

    int getX();

    int getY();

    void setLocation(int x, int y);
}