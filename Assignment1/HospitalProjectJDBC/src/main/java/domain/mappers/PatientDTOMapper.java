package domain.mappers;


import dao.model.Patient;
import domain.model.PatientDTO;
import jakarta.security.enterprise.credential.Credential;

public class PatientDTOMapper {
//    public Patient dtoToEntity(PatientDTO patientDTO) {
//
//        return new Patient(patientDTO.getBirthDate(),
//                new Credential(patientDTO.getUserName(), patientDTO.getPassword(), patientDTO.getId()),
//                patientDTO.getId(),patientDTO.getName(),patientDTO.getPhone());
//
//    }

    public PatientDTO entityToDto(Patient patient1) {
        return new PatientDTO(patient1.getId(),patient1.getName(),
                patient1.getBirthDate(),patient1.getPhone(),0,null,null);
    }

}