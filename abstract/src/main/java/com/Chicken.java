package com;

public abstract class Chicken {

    double price;
    String type;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void calculateNum();
}
