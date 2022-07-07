package co.com.bancolombia.api;
import co.com.bancolombia.model.electriccar.ElectricCar;
import co.com.bancolombia.usecase.electriccar.ElectricCarUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
//    private final MyUseCase useCase;

    private final ElectricCarUseCase electricCarUseCase;

    @GetMapping(path = "/path")
    public String commandName() {
//      return useCase.doAction();
        return "Hello World";
    }

    @GetMapping(path = "/electric-car-api/infovehicle/{brand}")
    public Optional<ElectricCar> getInfoVehicle(@PathVariable String brand) {
        return electricCarUseCase.getInfoVehicle(brand);
        //return "Brand Vehicle: " + brand;
    }

    @GetMapping(path = "/electric-car-api/price/{brand}")
    public Optional<Float> getBrandPrice(@PathVariable String brand) {
        return electricCarUseCase.getPrice(brand);
        //return "Brand Vehicle: " + brand;
    }

}
