package com.example.demo.newentity;

import jakarta.persistence.Id;

public class NewfileEntity{
@Id
private Long id;
@NotBlank(message = "Should not contain spaces")
private String name;
private String email;
}