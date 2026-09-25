package ui;

import domain.model.PatientDTO;
import domain.service.PatientService;
import jakarta.inject.Inject;

import java.util.List;

public class PatientUI {
    private final PatientService patientService;

    @Inject
    public PatientUI(PatientService patientService) {
        this.patientService = patientService;
    }

    public List<PatientDTO> getPatients() {
        return patientService.getPatients();
    }

    public int addPatient(PatientDTO patientDTO) {
        return patientService.addPatient(patientDTO);
    }

    public void updatePatient(PatientDTO patientDTO) {
        patientService.updatePatient(patientDTO);
    }

    public void deletePatient(int idDelete) {
         patientService.deletePatient(idDelete);
    }


}
