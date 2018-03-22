package com.hospital.dao.impl;

import com.hospital.dao.UserDao;
import com.hospital.dao.mapper.UserMapper;
import com.hospital.dao.mapper.UserMapper2;
import com.hospital.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Boolean checkUser(User userFromPage) {


        String sql = "SELECT * FROM user where email = '" + userFromPage.getEmail() + "' AND password = '" + userFromPage.getPassword() + "' ";
        List<User> userList = jdbcTemplate.query(sql, new UserMapper2());
        if (userList.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public User getUserByEmail(String userEmail) {
        String sql = "SELECT user.id, user.email, user.password, role.id as roleId, role.name " +
                "FROM user, role  " +
                "WHERE email = '" + userEmail + "' AND user.roleId=role.id ";
        User user = (User) jdbcTemplate.query(sql, new UserMapper());
        return user;
    }


//        User userFromDb = jdbcTemplate.queryForObject(sql, new Object[]{userFromPage.getEmail()}, new UserMapper());
//        if (userFromPage.getEmail().equals(userFromDb.getEmail())&&userFromPage.getPassword().equals(userFromDb.getPassword())){
//            return true;
//        }
//        return false;


    public void addUser(User user) {
//        Role role = new Role();
//        String sqlGetRole = "SELECT * FROM role WHERE id = '" + user.getRoleId() + "' ";
//        String sql = "INSERT INTO user (email, password, roleId) VALUES (?,?,?)";
//        jdbcTemplate.update(sql, user.getEmail(), user.getPassword(), user.getRoleId());

    }
}
