package com.example.backend.repositories;

import com.example.backend.models.Type;

import java.util.List;

public interface TypeRepository {

  List<Type> findAll();
  Type findById(long id);
  Type save(Type type);
}
