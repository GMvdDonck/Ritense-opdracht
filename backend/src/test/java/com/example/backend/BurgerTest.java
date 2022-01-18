package com.example.backend;

import com.example.backend.models.Type;
import com.example.backend.repositories.TypeRepository;
import com.example.backend.rest.TypeController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class BurgerTest {

  @Autowired
  private TypeController typeController;
  @Autowired
  private TypeRepository typeRepository;

  @BeforeEach
  public void setup() {
  }

  @Test
  public void contextLoads() {
    assertNotNull(typeController);
  }

  @Test
  public void findsType() {
    Type findType = typeRepository.findById(1);
    assertNotNull(findType);
    assertEquals(findType.getMaxToppings(), 4);

    findType = typeRepository.findById(6);
    assertNull(findType);
  }
}
