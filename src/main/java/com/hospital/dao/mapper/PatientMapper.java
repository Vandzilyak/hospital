package com.hospital.dao.mapper;

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
        patient.setAge(rs.getInt("age"));
        patient.setCity(rs.getString("city"));
        patient.setDiagnosis(rs.getString("diagnosis"));
        return patient;
    }
}
