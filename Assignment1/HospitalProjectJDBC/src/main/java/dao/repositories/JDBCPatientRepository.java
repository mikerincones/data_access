package dao.repositories;

import dao.model.Patient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JDBCPatientRepository implements PatientRepository {
    private List<Patient> patients = new ArrayList<>();

    public List<Patient> getAll() {
        patients.add(new Patient(1, "Pepe", LocalDate.parse("1993-09-21"), "659-985-985"));
        patients.add(new Patient(2, "Moon", LocalDate.parse("1995-11-07"), "659-985-985"));
        patients.add(new Patient(3, "Daaani", LocalDate.parse("2020-09-15"), "659-985-985"));
        return patients;
    }

    @Override
    public int add(Patient patient) {
        return 0;
    }

    @Override
    public void update(Patient patient) {

    }

    @Override
    public void delete(int idDelete) {
        patients.removeIf(patient -> patient.getId() == idDelete);
    }

}
