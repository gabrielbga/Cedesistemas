package co.com.bancolombia.api;

import co.com.bancolombia.usecase.cards.CardsUseCase;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class RouterRest {
    private final CardsUseCase cardsUseCase;

    @GetMapping(path = "/cards")
    public Mono<String> listCards() {
        return cardsUseCase.getCards();
        //return Mono.just("Hello World CEDESISTEMAS ...");
    }
}
