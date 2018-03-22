package com.hospital.dao.mapper;

import com.hospital.entities.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper2 implements RowMapper<User> {

    public User mapRow(ResultSet rs, int i) throws SQLException {

        User user = new User();
        user.setId(rs.getLong("id"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));

        return user;
    }

}
