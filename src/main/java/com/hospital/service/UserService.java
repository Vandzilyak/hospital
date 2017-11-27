package com.hospital.service;

import com.hospital.entities.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    public void updateUser(User dummy);
    public void deleteUserById(Long id);
    public User getUserById(Long id);
    public List<User> getAllUser();
}
