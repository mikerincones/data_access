package domain.service;

import dao.model.Patient;
import dao.repositories.JDBCPatientRepository;
import domain.mappers.PatientDTOMapper;
import domain.model.PatientDTO;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private final JDBCPatientRepository patientRepository;
    private final PatientDTOMapper patientDTOMapper;

    @Inject
    public PatientService(JDBCPatientRepository patientRepository, PatientDTOMapper patientDTOMapper) {
        this.patientRepository = patientRepository;
        this.patientDTOMapper = patientDTOMapper;
    }

    public List<PatientDTO> getPatients() {
        List<Patient> patients = patientRepository.getAll();
        List<PatientDTO> patientsDTOS = new ArrayList<>();
        for (Patient patient : patients) {
            PatientDTO patientsDTO = patientDTOMapper.entityToDto(patient);
            patientsDTOS.add(patientsDTO);
        }
        return patientsDTOS;
    }

    public int addPatient(PatientDTO patientDTO) {
        return patientRepository.add(patientDTOMapper.dtoToEntity(patientDTO));
    }

    public void updatePatient(PatientDTO patientDTO) {
        patientRepository.update(patientDTOMapper.dtoToEntity(patientDTO));
    }

    public void deletePatient(int idDelete) {
        patientRepository.delete(idDelete);
    }


}
