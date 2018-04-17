package com.hospital.service;

import com.hospital.entities.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DoctorService {

    Doctor addDoctor(Doctor doctor);
    void delete(Long id);
    Doctor getByName(String name);
    Doctor editDoctor(Doctor doctor);
    List<Doctor> getAll();
}
