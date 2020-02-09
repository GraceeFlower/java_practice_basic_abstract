package com;

public class Cock extends Chicken {

  public Cock(double price) {
    this.price = price;
  }

  @Override
  public void calculateNum() {
    System.out.format("100元可以买%s %d只\n", this.getType(), (int)(100 / this.getPrice()));
  }
}
