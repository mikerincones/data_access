package dao.repositories;

import dao.model.MedRecord;

import java.util.ArrayList;
import java.util.List;

public class JDBCMedRecordRepository implements MedRecordRepository {
    private final List<MedRecord> medRecords = new ArrayList<>();


    @Override
    public List<MedRecord> getAll() {
        return medRecords;
    }

    @Override
    public int addMedRecord(MedRecord medRecord) {
        medRecords.add(medRecord);
        return medRecord.getId();
    }

    @Override
    public void updateMedRecord(MedRecord medRecord) {
        medRecords.stream()
                .filter(item -> item.getId() == medRecord.getId())
                .findFirst()
                .ifPresent(record -> {
//Lo que queremos modificar
                });
    }

    @Override
    public void deleteMedRecord(int idDelete) {
        medRecords.removeIf(medRecord -> medRecord.getId() == idDelete);
    }
}
