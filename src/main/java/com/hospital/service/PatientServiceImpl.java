package com.hospital.service;

import com.hospital.dao.PatientDao;
import com.hospital.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDao patientDao;

    public void addPatient(Patient patient) {
        patientDao.addPatient(patient);
    }

    public void updatePatient(Patient patient) {
        patientDao.updatePatient(patient);
    }

    public void deletePatientById(Long id) {
        patientDao.deletePatientById(id);
    }

    public Patient getPatientById(Long id) {
        return patientDao.getPatientById(id);
    }

    public List<Patient> getAllPatients() {
        return patientDao.getAllPatients();
    }
}
