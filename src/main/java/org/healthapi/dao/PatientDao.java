package org.healthapi.dao;

import org.healthapi.model.Patient;

import java.util.List;

public interface PatientDao {
    List<Patient> getPatients();
}
