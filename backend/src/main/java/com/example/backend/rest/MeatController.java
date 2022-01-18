package com.example.backend.rest;

import com.example.backend.models.Meat;
import com.example.backend.repositories.MeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MeatController {

  @Autowired
  private MeatRepository repository;

  @GetMapping("/meat")
  public List<Meat> getAllMeat() {
    return repository.findAll();
  }
}
