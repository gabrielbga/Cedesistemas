package co.com.bancolombia.usecase.electriccar;

import co.com.bancolombia.model.electriccar.ElectricCar;
import co.com.bancolombia.model.electriccar.gateways.ElectricCarRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class ElectricCarUseCase {

    private final ElectricCarRepository electricCarRepository;

    public Optional<ElectricCar> getInfoVehicle(String brand) {
        return electricCarRepository.getInfoVehicle(brand);
    }
    //Todo lo relacionado a la logica de mi aplicación con respecto al metodo obtener precio

    public Optional<Float> getPrice(String brand) {
        return electricCarRepository.getPrice(brand);
    }

}
