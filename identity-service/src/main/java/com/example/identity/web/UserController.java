package com.example.identity.web;
import com.example.identity.domain.entity.User; import com.example.identity.domain.repo.UserRepository;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/users")
public class UserController {
  private final UserRepository repo; public UserController(UserRepository r){this.repo=r;}
  @PostMapping public User create(@RequestBody User u){ return repo.save(u); }
}
