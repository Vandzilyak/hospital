package com.hospital.service;

import com.hospital.entities.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {

    Patient addPatient(Patient patient);
    void delete(long id);
    Patient getByName(String name);
    Patient editPatient(Patient patient);
    List<Patient> getAll();
}
