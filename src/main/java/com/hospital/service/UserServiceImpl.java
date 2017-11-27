package com.hospital.service;

import com.hospital.dao.UserDaoImpl;
import com.hospital.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDaoImpl userDaoImpl;

    public void addUser(User user) {
        userDaoImpl.addUser(user);
    }

    public void updateUser(User user) {
        userDaoImpl.updateUser(user);
    }

    public void deleteUserById(Long id) {
        userDaoImpl.deleteUserById(id);
    }

    public User getUserById(Long id) {
        return userDaoImpl.getUserById(id);
    }

    public List<User> getAllUser() {
        return userDaoImpl.getAllUser();
    }
}
