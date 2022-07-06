package co.com.bancolombia.api;

import co.com.bancolombia.model.person.Person;
import co.com.bancolombia.usecase.person.PersonUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {

    //TODO Conversión de datos para retornar en body
private  final PersonUseCase useCase;
    public Mono<ServerResponse> getPerson(ServerRequest serverRequest) {
        var person = useCase.getPerson(serverRequest.pathVariable("id"));
        return ServerResponse.ok().body(person,Person.class);
    }
    public Mono<ServerResponse> getBalance(ServerRequest serverRequest) {
        var balance = useCase.getBalance(serverRequest.pathVariable("id"));
        return ServerResponse.ok().body(balance,Float.class);
    }


}
