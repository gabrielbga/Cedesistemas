package co.com.bancolombia.electriccarapi;

import co.com.bancolombia.model.electriccar.ElectricCar;
import co.com.bancolombia.model.electriccar.gateways.ElectricCarRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApiElectricCarService implements ElectricCarRepository {

    //implements dbElectricCarRepository

    @Override
    public Optional<ElectricCar> getInfoVehicle(String brand) {
        return Optional.of(ElectricCar.builder().brand(brand).powerBank(123f).maxSpeed(120f).price(100000d).build());
    }

    @Override
    public Optional<Float> getPrice(String brand) {
        return Optional.of(100000f);
    }
}
