package co.com.bancolombia.model.pet;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder(toBuilder = true)
public class Pet {
    private String name;
    private String ownerId;
    private String ownerName;
    private String specie;
    private String race;
    private String birthDate;
    private Integer Age;
}
