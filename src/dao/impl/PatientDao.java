package dao.impl;

import models.Patient;

import java.util.List;
import java.util.Map;

public interface PatientDao {
    String addPatientToHospital(Long id, Patient patient);
    String addPatientsToHospital(Long id, List<Patient> patients);
    String updatePatientById(Long id, Patient patientsNewInfo);
    void removePatientById(Long id);
    Patient getPatientById(Long id);
    Map<Integer, Patient> getPatientByAge(int age);
    List<Patient> sortPatientsByAge(String ascOrDesc);
}
