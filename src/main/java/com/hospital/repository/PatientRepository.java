package com.hospital.repository;

import com.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Query("SELECT p from Patient p where p.name = :name")
    Patient findByName(String name);
}

