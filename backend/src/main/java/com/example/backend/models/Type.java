package com.example.backend.models;

public class Type {
  private final long id;
  private String name;
  private int maxToppings;
  private String extras;
  private double basePrice;

  public Type(long id, String name, int maxToppings, String extras, double basePrice) {
    this.id = id;
    this.name = name;
    this.maxToppings = maxToppings;
    this.extras = extras;
    this.basePrice = basePrice;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMaxToppings() {
    return maxToppings;
  }

  public void setMaxToppings(int maxToppings) {
    this.maxToppings = maxToppings;
  }

  public String getExtras() {
    return extras;
  }

  public void setExtras(String extras) {
    this.extras = extras;
  }

  public double getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(double basePrice) {
    this.basePrice = basePrice;
  }
}
