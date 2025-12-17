package com.example.demo.newentity;

import jakarta.persistence.Id;
import jakrata.validation.constraints.NotBlank;

public class NewfileEntity{
@Id
private Long id;
@NotBlank(message = "Should not contain spaces")
private String name;
@NotBlank(message = "")
private String email;
}