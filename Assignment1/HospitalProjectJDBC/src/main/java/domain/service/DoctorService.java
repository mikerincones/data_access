package domain.service;

import dao.model.Doctor;
import dao.repositories.JDBCDoctorRepository;
import jakarta.inject.Inject;

import java.util.List;

public class DoctorService {
    private final JDBCDoctorRepository doctorRepository;

    @Inject
    public DoctorService(JDBCDoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getDoctors() {
        return doctorRepository.getAll();
    }
}
