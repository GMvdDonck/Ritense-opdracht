package com.example.backend.repositories;

import com.example.backend.models.Topping;

import java.util.List;

public interface ToppingRepository {

  List<Topping> findAll();
  Topping findById(long id);
  Topping save(Topping topping);
}
