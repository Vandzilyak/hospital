package com.hospital.dao;

import com.hospital.entities.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public void updateUser(User dummy);
    public void deleteUserById(Long id);
    public User getUserById(Long id);
    public List<User> getAllUser();

}

