package ui;

import domain.service.MedRecordService;
import jakarta.inject.Inject;

public class MedRecordUI {
    private final MedRecordService medRecordService;

    @Inject
    public MedRecordUI(MedRecordService medRecordService) {
        this.medRecordService = medRecordService;
    }
}
