package org.healthapi.dao;

import org.healthapi.model.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcPatientDao implements PatientDao{
    private JdbcTemplate jdbcTemplate;
    private Logger log = LoggerFactory.getLogger(getClass());

    public JdbcPatientDao(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate; }

    @Override
    public List<Patient> getPatients(){
        List<Patient> patients = new ArrayList<>();
        String sql = "SELECT gender, age, hypertension, heart_disease, smoking_history, bmi, HbA1c_level, blood_glucose_level, diabetes FROM patient_data";
        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
            while (results.next()) {
                Patient patient = mapRowToPatient(results);
                patients.add(patient);
            }
        } catch (CannotGetJdbcConnectionException e) {
            //Do Something
        }
        return patients;
    }

    public Patient mapRowToPatient(SqlRowSet result){
        Patient p = new Patient();
        p.setGender(result.getString("gender"));
        p.setAge(result.getString("age"));
        p.setHypertension(result.getInt("hypertension"));
        p.setHeart_disease(result.getInt("heart_disease"));
        p.setSmoking_history(result.getString("smoking_history"));
        p.setBmi(result.getFloat("bmi"));
        p.setHba1c_level(result.getFloat("hba1c_level"));
        p.setBlood_glucose_level(result.getInt("blood_glucose_level"));
        p.setDiabetes(result.getInt("diabetes"));
        return p;
    }

}
