package ru.shepelev.crane.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shepelev.crane.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
