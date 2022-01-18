package com.example.backend.rest;

import com.example.backend.models.Topping;
import com.example.backend.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToppingController {

  @Autowired
  private ToppingRepository repository;

  @GetMapping("/toppings")
  public List<Topping> getAllToppings() {
    return repository.findAll();
  }
}
