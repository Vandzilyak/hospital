package com.hospital.service;

import com.hospital.entities.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    List<Role> getAll();
    Role findByName(String name);
    Role addRole(Role role);
    Role findRoleById(Long id);
}
