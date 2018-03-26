package com.hospital.repository.mapper;

import com.hospital.entities.Role;
import com.hospital.entities.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    public User mapRow(ResultSet rs, int i) throws SQLException {

        User user = new User();
        Role role = new Role();
        user.setId(rs.getLong("id"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));
        role.setId(rs.getLong("roleId"));
        role.setName(rs.getString("name"));
        user.setRole(role);
        return user;
    }
}
