package ru.dockerizedapplication.services;

import ru.dockerizedapplication.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);

    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    void deleteUserById(Long id);

    User getUserByName(String name);


}
