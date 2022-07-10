package co.com.bancolombia.apipetservice;

import co.com.bancolombia.model.pet.Pet;
import co.com.bancolombia.model.pet.gateways.PetService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ApiPetService implements PetService {
    @Override
    public Mono<Pet> getPet(String name, String ownerId){
        return Mono.just(Pet.builder()
                .name(name)
                .ownerId(ownerId)
                .ownerName("Nombre Dueño mascota")
                .specie("felino/canino")
                .race("Raza mascota")
                .birthDate("2000-01-01")
                .Age(0)
                .build());
    }
    @Override
    public Mono<Integer> getAge(String name, String ownerId){
        return Mono.just(0);
    }
}
