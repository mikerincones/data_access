package domain.service;

import dao.repositories.JDBCMedRecordRepository;
import domain.model.MedRecordDTO;

import java.util.List;

public class MedRecordService {
    private final JDBCMedRecordRepository medRecordRepository;

    public MedRecordService(JDBCMedRecordRepository medRecordRepository) {
        this.medRecordRepository = medRecordRepository;
    }

    public List<MedRecordDTO> getMedRecords() {
        return medRecordRepository.getAll();
    }

    public int addMedRecord(MedRecordDTO medRecord) {
        return medRecordRepository.addMedRecord(medRecord);
    }

    public void updateMedRecord(MedRecordDTO medRecord) {
        medRecordRepository.updateMedRecord(medRecord);
    }

    public void deleteMedRecord(int idDelete) {
        medRecordRepository.deleteMedRecord(idDelete);
    }
}
