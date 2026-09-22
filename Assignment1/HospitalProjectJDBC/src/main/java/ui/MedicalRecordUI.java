package ui;

import jakarta.inject.Inject;

public class MedicalRecordUI {
    private final MedicalRecordService medicalRecordService;

    @Inject
    public MedicalRecordUI(MedicalRecordService medicalRecordService) {
        this.medicalRecordService = medicalRecordService;
    }
}
