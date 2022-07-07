package co.com.bancolombia.model.electriccar;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class ElectricCar {

    private String brand;
    private Float powerBank;
    private Float maxSpeed;
    private Double price;

}
