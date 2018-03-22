package com.hospital.dao;

import com.hospital.entities.User;


public interface UserDao {

    Boolean checkUser(User user);

    User getUserByEmail(String userEmail);

    void addUser(User user);
}
