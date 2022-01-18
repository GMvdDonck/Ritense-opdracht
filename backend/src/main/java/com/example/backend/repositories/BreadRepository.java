package com.example.backend.repositories;

import com.example.backend.models.Bread;

import java.util.List;

public interface BreadRepository {

  List<Bread> findAll();
  Bread findById(long id);
  Bread save(Bread bread);
}
