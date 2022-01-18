package com.example.backend.repositories;

import com.example.backend.models.Type;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TypeRepositoryMock implements TypeRepository {

  private ArrayList<Type> types = new ArrayList<>();

  public TypeRepositoryMock() {
    this.types.add(new Type(1, "Basic", 4, "", 5.99));
    this.types.add(new Type(2, "Healthy", 6, "", 6.99));
    this.types.add(new Type(3, "Combo", 0, "Comes with fries and a drink", 10.99));
  }

  @Override
  public List<Type> findAll() {
    return this.types;
  }

  @Override
  public Type findById(long id) {
    for (Type type : types) {
      if (type.getId() == id) {
        return type;
      }
    }
    return null;
  }

  @Override
  public Type save(Type type) {
    types.add(type);
    return type;
  }
}
