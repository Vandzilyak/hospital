package com.hospital.service;

import com.hospital.entities.User;

import java.util.List;

public interface UserService {

    User addUser(User user);
    void delete(long id);
    User getByEmail(String email);
    User editUser(User user);
    List<User> getAll();
}
