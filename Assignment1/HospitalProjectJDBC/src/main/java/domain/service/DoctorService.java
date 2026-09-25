package domain.service;

import dao.model.Doctor;
import dao.repositories.JDBCDoctorRepository;
import domain.mappers.DoctorDTOMapper;
import domain.model.DoctorDTO;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;

public class DoctorService {
    private final JDBCDoctorRepository doctorRepository;
    private final DoctorDTOMapper doctorDTOMapper;

    @Inject
    public DoctorService(JDBCDoctorRepository doctorRepository, DoctorDTOMapper doctorDTOMapper) {
        this.doctorRepository = doctorRepository;
        this.doctorDTOMapper = doctorDTOMapper;
    }

    public List<DoctorDTO> getDoctors() {
        List<Doctor> doctors = doctorRepository.getAll();
        List<DoctorDTO> doctorDTOS = new ArrayList<>();
        for (Doctor doctor : doctors) {
            DoctorDTO doctorDTO = doctorDTOMapper.entityToDto(doctor);
            doctorDTOS.add(doctorDTO);
        }
        return doctorDTOS;
    }
}
