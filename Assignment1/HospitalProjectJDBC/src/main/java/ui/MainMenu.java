package ui;

import common.Constants;
import domain.model.PatientDTO;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import dao.model.Patient;
import java.util.Scanner;
//

//final SeContainer container = initializer.initialize();
//PatientUI patientUI = container.select(PatientUI.class).get();
;
//final SeContainer container2 = initializer.initialize();
//MedicalRecordUI medicalRecordUI = container2.select(MedicalRecordUI.class).get();

public class MainMenu {

    static void main() {
        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        final SeContainer container = initializer.initialize();
        PatientUI patientUI = container.select(PatientUI.class).get();
        final SeContainer container1 = initializer.initialize();
        DoctorUI doctorUI = container1.select(DoctorUI.class).get();
        final SeContainer container2 = initializer.initialize();
        CredentialUI credentialUI = container2.select(CredentialUI.class).get();
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
//                        System.out.println("Add Patient");
//                        PatientDTO patient= new PatientDTO();
//                        patientUI.addPatient(patient);
//                        break;

                    case 3:
//                        System.out.println("Update Patient");
//                        PatientDTO patient2= new PatientDTO();
//                        patientUI.updatePatient(patient2);
//
//                        break;

                    case 4:
                        System.out.println("Insert PatientID");
                        int id = sc.nextInt();
                        patientUI.deletePatient(id);
                        break;

                    case 5:
                        System.out.println("Get all Doctors");
                        System.out.println(doctorUI.getDoctors());
                        break;

                    case 6:
                        System.out.println("Get all MedRecords by patient");
                        break;

                    case 7:
                        System.out.println("Add MedRecord");
                        break;

                    case 8:
                        System.out.println("Update MedRecord");
                        break;

                    case 9:
                        System.out.println("Delete MedRecord");
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
