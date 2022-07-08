package co.com.bancolombia.usecase.cards;

import co.com.bancolombia.model.gateways.ServiceGateway;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CardsUseCase {
    private final ServiceGateway serviceGateway;

    public Mono<String> getCards() {
        return serviceGateway.getCustomerCards();
        //return Mono.just("");
    }
}
