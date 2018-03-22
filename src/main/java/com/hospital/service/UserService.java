package com.hospital.service;

import com.hospital.entities.User;

public interface UserService {

    Boolean checkUser(User user);

    void addUser(User user);
}
