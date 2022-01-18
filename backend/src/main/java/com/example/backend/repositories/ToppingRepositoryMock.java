package com.example.backend.repositories;

import com.example.backend.models.Topping;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ToppingRepositoryMock implements ToppingRepository {

  private ArrayList<Topping> toppings = new ArrayList<>();

  public ToppingRepositoryMock() {
    this.toppings.add(new Topping(1, "Cheese", 1.00));
    this.toppings.add(new Topping(2, "Ketchup", 0.50));
    this.toppings.add(new Topping(3, "Lettuce", 0.75));
    this.toppings.add(new Topping(4, "Tomato", 1.00));
    this.toppings.add(new Topping(5, "Onion", 1.50));
    this.toppings.add(new Topping(6, "Pickles", 1.50));

  }

  @Override
  public List<Topping> findAll() {
    return this.toppings;
  }

  @Override
  public Topping findById(long id) {
    for (Topping topping : toppings) {
      if (topping.getId() == id) {
        return topping;
      }
    }
    return null;
  }

  @Override
  public Topping save(Topping topping) {
    toppings.add(topping);
    return topping;
  }
}
