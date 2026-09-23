package dao.repositories;

import dao.model.MedRecord;

import java.util.List;

public interface MedRecordRepository {

    List<MedRecord> getAll();

    int addMedRecord(MedRecord medRecord);

    void updateMedRecord(MedRecord medRecord);

    void deleteMedRecord(int idDelete);

}
