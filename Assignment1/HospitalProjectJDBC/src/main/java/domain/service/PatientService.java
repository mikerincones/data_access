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
        List<PatientDTO> patientsDTOs = new ArrayList<>();
        for(Patient patient: patients){
        PatientDTO patientsDTO = patientDTOMapper.entityToDto(patient);
        patientsDTOs.add(patientsDTO);
        }
        return patientsDTOs;
    }

    public PatientDTO getPatient(){

    }

//    public int addPatient(PatientDTO patient) {
//        return patient;
//    }

    public void deletePatient(int idDelete) {
        patientRepository.delete(idDelete);
    }



}
