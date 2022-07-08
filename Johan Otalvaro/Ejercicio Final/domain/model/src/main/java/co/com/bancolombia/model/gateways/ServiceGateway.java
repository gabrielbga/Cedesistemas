package co.com.bancolombia.model.gateways;

import reactor.core.publisher.Mono;

public interface ServiceGateway {
    Mono<String> getCustomerCards();
}
