package com.hospital.service.impl;

import com.hospital.entities.Role;
import com.hospital.repository.RoleRepository;
import com.hospital.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }

    public Role addRole(Role role) {
        return roleRepository.saveAndFlush(role);
    }

    public Role findRoleById(Long id) {
        return roleRepository.findOne(id);
    }
}
