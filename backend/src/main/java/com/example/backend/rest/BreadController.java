package com.example.backend.rest;

import com.example.backend.models.Bread;
import com.example.backend.repositories.BreadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BreadController {

  @Autowired
  private BreadRepository repository;

  @GetMapping("/bread")
  public List<Bread> getAllBread() {
    return repository.findAll();
  }
}
