package com;

public abstract class Chicken {

    double price;
    String type;

    public double getPrice() {
        return price;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public abstract void calculateNum();
}
