package co.com.bancolombia.api;

import co.com.bancolombia.model.pet.Pet;
import co.com.bancolombia.usecase.pet.PetUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {
    private  final PetUseCase useCase;
    public Mono<ServerResponse> getPet(ServerRequest serverRequest) {
        var pet = useCase.getPet(serverRequest.pathVariable("name"),
                serverRequest.pathVariable("ownerId"));
        return ServerResponse.ok().body(pet, Pet.class);
    }

    public Mono<ServerResponse> getAge(ServerRequest serverRequest) {
        var age = useCase.getAge(serverRequest.pathVariable("name"),
                serverRequest.pathVariable("ownerId"));
        return ServerResponse.ok().body(age,Integer.class);
    }
}
