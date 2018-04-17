package com.hospital.service.impl;

import com.hospital.entities.Doctor;
import com.hospital.repository.DoctorRepository;
import com.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.saveAndFlush(doctor);
    }

    public void delete(Long id) {
        doctorRepository.delete(id);
    }

    public Doctor getByName(String name) {
        return doctorRepository.findByName(name);
    }

    public Doctor editDoctor(Doctor doctor) {
        return doctorRepository.saveAndFlush(doctor);
    }

    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }
}
