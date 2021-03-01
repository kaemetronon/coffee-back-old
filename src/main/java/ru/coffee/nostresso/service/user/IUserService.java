package ru.coffee.nostresso.service.user;

import ru.coffee.nostresso.model.entity.User;

import java.util.UUID;

public interface IUserService {
    Iterable<User> findAll();

    UUID addUser(User user);

    void updateUser(User user);

    void deleteById(UUID userId);
}
