package com.example.backend.rest;

import com.example.backend.models.Type;
import com.example.backend.repositories.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeController {

  @Autowired
  private TypeRepository repository;

  @GetMapping("/types")
  public List<Type> getAllTypes() {
    return repository.findAll();
  }
}
