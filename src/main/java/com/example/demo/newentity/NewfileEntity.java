package com.example.demo.newentity;

import jakarta.persistence.*;
import jakrata.validation.constraints.*;

@Entity
@Table(name="Student")
public class NewfileEntity{
@Id
@Generatedvalue(strategy=generationtType,IDENTITY)
private Long id;
@NotBlank(message = "Should not contain spaces")
private String name;
@NotBlank(message = "No blank format")
@Email(message = "Invalid format")
private String email;
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public NewfileEntity(Long id, @NotBlank(message = "should not contain spaces") String name,
        @NotBlank(message = "No blank allowed") @Email(message = "Invalid Format") String email) {
    this.id = id;
    this.name = name;
    this.email = email;
}
}
