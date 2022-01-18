package com.example.backend.repositories;

import com.example.backend.models.Meat;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MeatRepositoryMock implements MeatRepository {

  private ArrayList<Meat> meats = new ArrayList<>();

  public MeatRepositoryMock() {
    this.meats.add(new Meat(1, "Black angus"));
    this.meats.add(new Meat(2, "Kobe beef"));
    this.meats.add(new Meat(3, "Vegan"));
    this.meats.add(new Meat(4, "Fish"));
  }

  @Override
  public List<Meat> findAll() {
    return this.meats;
  }

  @Override
  public Meat findById(long id) {
    for (Meat meat : meats) {
      if (meat.getId() == id) {
        return meat;
      }
    }
    return null;
  }

  @Override
  public Meat save(Meat meat) {
    meats.add(meat);
    return meat;
  }
}
