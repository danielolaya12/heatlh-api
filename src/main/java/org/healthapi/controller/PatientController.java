package org.healthapi.controller;

import org.healthapi.dao.PatientDao;
import org.healthapi.model.Patient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    private PatientDao patientDao;

    public PatientController(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Patient> getAllPatients() {
        List<Patient> patients = patientDao.getPatients();
        return patients;
    }
}
