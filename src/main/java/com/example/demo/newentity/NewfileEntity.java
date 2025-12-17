package com.example.demo.newentity;

import jakarta.persistence.*;
import jakrata.validation.constraints.*;

public class NewfileEntity{
@Id
@Generatedvalue(strategy=generationtType,IDENTITY)
private Long id;
@NotBlank(message = "Should not contain spaces")
private String name;
@NotBlank(message = "No blank format")
@Email(message = "Invalid format")
private String email;
}