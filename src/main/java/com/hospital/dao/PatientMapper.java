package com.hospital.dao;

import com.hospital.entities.Patient;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientMapper implements RowMapper<Patient> {


    public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {
        Patient patient = new Patient();
        patient.setId(rs.getLong("id"));
        patient.setName(rs.getString("name"));
        patient.setSurname(rs.getString("surname"));
        patient.setEmail(rs.getString("email"));
        patient.setPassword(rs.getString("password"));
        patient.setAge(rs.getInt("age"));
        patient.setCity(rs.getString("city"));

        return patient;
    }
}
