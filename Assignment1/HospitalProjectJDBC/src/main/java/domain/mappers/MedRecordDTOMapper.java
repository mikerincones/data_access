package domain.mappers;

import dao.model.MedRecord;
import domain.model.MedRecordDTO;


import java.time.LocalDate;

public class MedRecordDTOMapper {

    public MedRecord dtoToEntity(MedRecordDTO medRecordDTO) {
        return new MedRecord(medRecordDTO.getId(),medRecordDTO.getIdPatient(),medRecordDTO.getIdDoctor(),medRecordDTO.getDescription(), LocalDate.parse(medRecordDTO.getDate()));
    }

    public MedRecordDTO entityToDto(MedRecord medRecord) {
        return new MedRecordDTO(medRecord.getId(),medRecord.getDiagnosis(),medRecord.getAdmission_date().toString(),medRecord.getPatient_id(), medRecord.getDoctor_id(), null);
    }
}
