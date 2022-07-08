package co.com.bancolombia.config;

import co.com.bancolombia.model.gateways.ServiceGateway;
import co.com.bancolombia.usecase.cards.CardsUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CardsUseCase cardsUseCase(ServiceGateway gateway) {
        return new CardsUseCase(gateway);
    }
}
