package com.exemple.bloggingbackend.repositories;

import com.exemple.bloggingbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByUsername(String username);
}
