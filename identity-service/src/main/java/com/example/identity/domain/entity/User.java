package com.example.identity.domain.entity;
import jakarta.persistence.*; import java.util.UUID;
@Entity @Table(name="users")
public class User {
  @Id private String id = UUID.randomUUID().toString();
  private String email; private String role;
  public String getId(){return id;} public String getEmail(){return email;} public void setEmail(String v){email=v;}
  public String getRole(){return role;} public void setRole(String v){role=v;}
}
