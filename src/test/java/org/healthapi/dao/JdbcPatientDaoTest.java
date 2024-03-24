package org.healthapi.dao;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;

class JdbcPatientDaoTest {
    JdbcPatientDao patientDao = new JdbcPatientDao(new JdbcTemplate());

    @Test
    public void testGetPatient(){
        patientDao.getPatients();
    }

}