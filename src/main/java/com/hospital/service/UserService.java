package com.hospital.service;

import com.hospital.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User addUser(User user);
    void delete(long id);
    User getByEmail(String email);
    User editUser(User user);
    List<User> getAll();
}
