package ru.dockerizedapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dockerizedapplication.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByName(String name);
}
