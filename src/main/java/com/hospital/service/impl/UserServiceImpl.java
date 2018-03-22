package com.hospital.service.impl;

import com.hospital.dao.UserDao;
import com.hospital.entities.User;
import com.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;


    public Boolean checkUser(User user) {
        return userDao.checkUser(user);
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }
}
