package com.hospital.dao;

import com.hospital.entities.Patient;

import java.util.List;

public interface PatientDao {
    public void addPatient(Patient patient);

    public void updatePatient(Patient dummy);

    public void deletePatientById(Long id);

    public Patient getPatientById(Long id);

    public List<Patient> getAllPatients();

}

