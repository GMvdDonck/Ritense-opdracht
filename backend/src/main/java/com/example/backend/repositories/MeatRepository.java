package com.example.backend.repositories;

import com.example.backend.models.Meat;

import java.util.List;

public interface MeatRepository {

  List<Meat> findAll();
  Meat findById(long id);
  Meat save(Meat meat);
}
