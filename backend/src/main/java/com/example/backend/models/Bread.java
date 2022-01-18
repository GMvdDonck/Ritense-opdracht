package com.example.backend.models;

public class Bread {
  private long id;
  private String type;

  public Bread(long id, String type) {
    this.id = id;
    this.type = type;
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
}
