package com.example.backend.models;

public class Topping {
  private long id;
  private String type;
  private double price;

  public Topping(long id, String type, double price) {
    this.id = id;
    this.type = type;
    this.price = price;
  }

  public long getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
