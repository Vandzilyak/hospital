package com.hospital.dao;

import com.hospital.entities.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientDao {

    void addPatient(Patient patient);

    void updatePatient(Patient dummy);

    void deletePatientById(Long id);

    Patient getPatientById(Long id);

    List<Patient> getAllPatients();

}

