package co.com.bancolombia.model.pet.gateways;

import co.com.bancolombia.model.pet.Pet;
import reactor.core.publisher.Mono;

public interface PetService {
    Mono<Pet> getPet(String name, String ownerId);
    Mono<Integer> getAge(String name, String ownerId);
}
