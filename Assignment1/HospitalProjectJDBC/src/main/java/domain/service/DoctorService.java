package domain.service;

import dao.model.Doctor;
import dao.repositories.JDBCDoctorRepository;
import jakarta.inject.Inject;

import java.util.List;

public class DoctorService {
    private final JDBCDoctorRepository jdbcDoctorRepository;

    @Inject
    public DoctorService(JDBCDoctorRepository jdbcDoctorRepository) {
        this.jdbcDoctorRepository = jdbcDoctorRepository;
    }

    public List<Doctor> getDoctors() {
        return jdbcDoctorRepository.getAll();
    }
}
