package dao.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Patient {
    private int id;
    private String name;
    private LocalDate birthDate;
    private String phone;
}
