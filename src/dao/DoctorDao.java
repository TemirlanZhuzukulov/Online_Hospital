package dao;

import models.Doctor;

import java.util.List;

public interface DoctorDao {
    String addDoctorToHospital(Long id, Doctor doctor);
    Doctor findDoctorById(Long id);
    String updateDoctor(Long id, Doctor doctor);
    void deleteDoctorById(Long id);
    String assignDoctorToDepartment(Long departmentId, List<Long> doctorsId);
    List<Doctor> getAllDoctorsByHospitalId(Long id);
    List<Doctor> getAllDoctorsByDepartmentId(Long id);
}
