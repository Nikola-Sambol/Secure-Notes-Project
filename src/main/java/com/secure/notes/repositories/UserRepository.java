package com.secure.notes.repositories;

import com.secure.notes.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String username);

    Boolean existsByUserName(String userName);
    Boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}

