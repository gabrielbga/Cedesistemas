package co.com.bancolombia.model.electriccar.gateways;

import co.com.bancolombia.model.electriccar.ElectricCar;

import java.util.Optional;

public interface ElectricCarRepository {

    Optional<ElectricCar> getInfoVehicle(String brand);
    Optional<Float> getPrice(String brand);

}
