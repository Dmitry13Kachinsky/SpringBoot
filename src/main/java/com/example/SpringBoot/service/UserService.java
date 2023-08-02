package com.example.SpringBoot.service;

import com.example.SpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findOne(Integer id);

    void save(User user);

    void update(Integer id, User updatedUser);

    void delete(Integer id);

}
