package com.hospital.dao;

import com.hospital.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void addUser(User user) {

        String sql = "INSERT INTO user (name, surname, email, password, age, city) VALUES (?,?,?,?,?,?)";
        jdbcTemplate.update(sql, user.getName(), user.getSurname(), user.getEmail(), user.getPassword(), user.getAge(), user.getCity());
    }

    public void updateUser(User user) {
        String sql = "update user set name='" + user.getName() + "', surname='" + user.getSurname() + "',email='" + user.getEmail() + "', password='" + user.getPassword() +
                "',age='" + user.getAge() + "',city='" + user.getCity() + "' where id=" + user.getId() + "";
        jdbcTemplate.update(sql);
    }

    public void deleteUserById(Long id) {
        String sql = "delete from user where id = ?";
        jdbcTemplate.update(sql, new Object[]{id});

    }

    public User getUserById(Long id) {
        String sql = "select * from user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new Object[]{id}, new UserMapper());
        return user;
    }

    public List<User> getAllUser() {
        String sql = "select * from user";
        List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;

    }
}
