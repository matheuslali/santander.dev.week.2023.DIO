package me.dio.santander.dev.week3.service;

import me.dio.santander.dev.week3.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
