package com.example.backend.repositories;

import com.example.backend.models.Bread;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BreadRepositoryMock implements BreadRepository {

  private ArrayList<Bread> breads = new ArrayList<>();

  public BreadRepositoryMock() {
    this.breads.add(new Bread(1, "Wholegrain"));
    this.breads.add(new Bread(2, "White"));
    this.breads.add(new Bread(3, "Brioche"));
    this.breads.add(new Bread(4, "Ciabatta"));
  }

  @Override
  public List<Bread> findAll() {
    return this.breads;
  }

  @Override
  public Bread findById(long id) {
    for (Bread bread : breads) {
      if (bread.getId() == id) {
        return bread;
      }
    }
    return null;
  }

  @Override
  public Bread save(Bread bread) {
    breads.add(bread);
    return bread;
  }
}
