package ui;
import dao.model.Doctor;
import domain.service.DoctorService;
import jakarta.inject.Inject;
import java.util.List;

public class DoctorUI {
    private final DoctorService doctorService;

    @Inject
    public DoctorUI(DoctorService doctorService){
        this.doctorService=doctorService;
    }

    public List<Doctor> getDoctors(){
        return doctorService.getDoctors();
    }

}
