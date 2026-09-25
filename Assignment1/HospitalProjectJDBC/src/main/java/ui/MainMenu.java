package ui;

import common.Constants;
import domain.model.MedRecordDTO;
import domain.model.PatientDTO;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

import java.time.LocalDate;
import java.util.Scanner;

public class MainMenu {

    static void main() {
        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        final SeContainer container = initializer.initialize();
        PatientUI patientUI = container.select(PatientUI.class).get();
        DoctorUI doctorUI = container.select(DoctorUI.class).get();
        CredentialUI credentialUI = container.select(CredentialUI.class).get();
        MedRecordUI medRecordUI = container.select(MedRecordUI.class).get();

        Scanner sc = new Scanner(System.in);
        System.out.println(Constants.LOGIN_MENU);
        String username = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        if (credentialUI.login(username, password)) {
            System.out.println("Login successful!");
            int option;
            do {
                System.out.println(Constants.MENU);
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("List of patients: " + patientUI.getPatients());
                        break;
                    case 2:
                        System.out.println("Add Patient");
                        System.out.println(patientUI.addPatient(new PatientDTO(0,"Miguel", LocalDate.parse("1993-09-21"),"652-854-857",1,"galachox","DAM2")));
                        break;
                    case 3:
                        System.out.println("Update Patient");
                        patientUI.updatePatient(new PatientDTO(4,"Moon",LocalDate.parse("1995-11-07"),"656-756-827",0,"lunakono","DaniTeQuiero"));
                        break;
                    case 4:
                        System.out.println("Insert PatientID");
                        patientUI.deletePatient(sc.nextInt());
                        break;
                    case 5:
                        System.out.println("Get all Doctors");
                        System.out.println(doctorUI.getDoctors());
                        break;
                    case 6:
                        System.out.println("Get all MedRecords by patient");
                        System.out.println("Insert patient ID:");
                        int id = sc.nextInt();
                        System.out.println(medRecordUI.getMedRecords(id));
                        break;

                    case 7:
                        System.out.println("Add MedRecord");
                        System.out.println(medRecordUI.addMedRecord(new MedRecordDTO()));
                        break;

                    case 8:
                        System.out.println("Update MedRecord");
                        medRecordUI.updateMedRecord(new MedRecordDTO());
                        break;

                    case 9:
                        System.out.println("Delete MedRecord");
                        System.out.println("Insert MedRecord ID:");
                        int idMedRecord = sc.nextInt();
                        medRecordUI.deleteMedRecord(idMedRecord);
                        break;

                    case 10:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid option!");
                }

            } while (option != 10);

        } else {
            System.out.println("Login failed!");
        }
    }
}
