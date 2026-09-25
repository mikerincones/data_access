package domain.service;
import dao.model.MedRecord;
import dao.repositories.JDBCMedRecordRepository;
import domain.mappers.MedRecordDTOMapper;
import domain.model.MedRecordDTO;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;

public class MedRecordService {
    private final JDBCMedRecordRepository medRecordRepository;
    private final MedRecordDTOMapper medRecordDTOMapper;

    @Inject
    public MedRecordService(JDBCMedRecordRepository medRecordRepository, MedRecordDTOMapper medRecordDTOMapper) {
        this.medRecordRepository = medRecordRepository;
        this.medRecordDTOMapper = medRecordDTOMapper;
    }

    public List<MedRecordDTO> getAllByPatientId(int patientId) {
        List<MedRecord> medRecords = medRecordRepository.getAllById(patientId);
        List<MedRecordDTO> medRecordDTOS = new ArrayList<>();
        for(MedRecord medRecord : medRecords){
            MedRecordDTO medRecordDTO = medRecordDTOMapper.entityToDto(medRecord);
            medRecordDTOS.add(medRecordDTO);
        }
        return medRecordDTOS;
    }

    public int addMedRecord(MedRecordDTO medRecord) {
        return medRecordRepository.addMedRecord(medRecordDTOMapper.dtoToEntity(medRecord));
    }

    public void updateMedRecord(MedRecordDTO medRecord) {
        medRecordRepository.updateMedRecord(medRecordDTOMapper.dtoToEntity(medRecord));
    }

    public void deleteMedRecord(int idDelete) {
        medRecordRepository.deleteMedRecord(idDelete);
    }

}
