package com.hospital.service;

import com.hospital.entities.Patient;

import java.util.List;

public interface PatientService {
    public void addPatient(Patient patient);

    public void updatePatient(Patient patient);

    public void deletePatientById(Long id);

    public Patient getPatientById(Long id);

    public List<Patient> getAllPatients();
}
