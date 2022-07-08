package co.com.bancolombia.apiconnect;

import co.com.bancolombia.model.gateways.ServiceGateway;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ApiConnectAdapter implements ServiceGateway {

    @Override
    public Mono<String> getCustomerCards() {
        return Mono.just("Api Connect Response -- CEDESISTEMAS ...");
    }
}
