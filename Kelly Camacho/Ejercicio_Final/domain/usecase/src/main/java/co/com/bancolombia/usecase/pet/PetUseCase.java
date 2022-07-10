package co.com.bancolombia.usecase.pet;

import co.com.bancolombia.model.pet.Pet;
import co.com.bancolombia.model.pet.gateways.PetService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class PetUseCase {
    private final PetService serviceGateway;

    public Mono<Pet> getPet(String name, String ownerId){
        return serviceGateway.getPet(name, ownerId);
    }

    public Mono<Integer> getAge(String name, String ownerId){
        return serviceGateway.getAge(name, ownerId);
    }
}
