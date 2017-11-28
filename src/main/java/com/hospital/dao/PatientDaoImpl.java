package com.hospital.dao;

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

        String sql = "INSERT INTO patient (name, surname, email, password, age, city) VALUES (?,?,?,?,?,?)";
        jdbcTemplate.update(sql, patient.getName(), patient.getSurname(), patient.getEmail(), patient.getPassword(), patient.getAge(), patient.getCity());
    }

    public void updatePatient(Patient patient) {
        String sql = "update patient set name='" + patient.getName() + "', surname='" + patient.getSurname() + "',email='" + patient.getEmail() + "', password='" + patient.getPassword() +
                "',age='" + patient.getAge() + "',city='" + patient.getCity() + "' where id=" + patient.getId() + "";
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
