package com.example.identity.domain.repo;
import com.example.identity.domain.entity.User; import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, String> {}
