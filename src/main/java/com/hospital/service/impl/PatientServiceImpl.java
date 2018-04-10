package com.hospital.service.impl;

import com.hospital.repository.PatientRepository;
import com.hospital.entities.Patient;
import com.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient addPatient(Patient patient) {
        return patientRepository.saveAndFlush(patient);
    }

    public void delete(long id) {
        patientRepository.delete(id);
    }

    public Patient getByName(String name) {
        return patientRepository.findByName(name);
    }

    public Patient editPatient(Patient patient) {
        return patientRepository.saveAndFlush(patient);
    }

    public List<Patient> getAll() {
        return patientRepository.findAll();
    }
}
