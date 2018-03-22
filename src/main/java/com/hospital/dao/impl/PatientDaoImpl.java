package com.hospital.dao.impl;

import com.hospital.dao.PatientDao;
import com.hospital.dao.mapper.PatientMapper;
import com.hospital.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class PatientDaoImpl implements PatientDao {


    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void addPatient(Patient patient) {

        String sql = "INSERT INTO patient (name, surname, age, city, diagnosis) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql, patient.getName(), patient.getSurname(), patient.getAge(), patient.getCity(), patient.getDiagnosis());
    }

    public void updatePatient(Patient patient) {
        String sql = "update patient set name='" + patient.getName() + "', surname='" + patient.getSurname() + "',age='" + patient.getAge() + "',city='" + patient.getCity() +
                "',diagnosis='" + patient.getDiagnosis() + "' where id=" + patient.getId() + "";
        jdbcTemplate.update(sql);
    }

    public void deletePatientById(Long id) {
        String sql = "delete from patient where id = ?";
        jdbcTemplate.update(sql, new Object[]{id});

    }

    public Patient getPatientById(Long id) {
        String sql = "select * from patient where id = ?";
        Patient patient = jdbcTemplate.queryForObject(sql, new Object[]{id}, new PatientMapper());
        return patient;
    }

    public List<Patient> getAllPatients() {
        String sql = "select * from patient";
        List<Patient> patients = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Patient>(Patient.class));
        return patients;

    }
}
