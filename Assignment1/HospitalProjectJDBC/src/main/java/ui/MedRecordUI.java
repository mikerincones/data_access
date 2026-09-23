package ui;

import dao.model.MedRecord;
import domain.model.MedRecordDTO;
import domain.model.PatientDTO;
import domain.service.MedRecordService;
import jakarta.inject.Inject;

import java.util.List;

public class MedRecordUI {
    private final MedRecordService medRecordService;

    @Inject
    public MedRecordUI(MedRecordService medRecordService) {
        this.medRecordService = medRecordService;
    }

    public List<MedRecordDTO> getMedRecords() {
        return medRecordService.getMedRecords();
    }

    public int addMedRecord(MedRecordDTO medRecord) {
        return medRecordService.addMedRecord(medRecord);
    }

    public void updateMedRecord(MedRecordDTO medRecord) {
        medRecordService.updateMedRecord(medRecord);
    }

    public void deleteMedRecord(int idDelete) {
        medRecordService.deleteMedRecord(idDelete);
    }
}
