package co.com.bancolombia.usecase.person;

import co.com.bancolombia.model.person.Person;
import co.com.bancolombia.model.person.gateways.PersonService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;
@RequiredArgsConstructor
public class PersonUseCase {
    private final PersonService serviceGateway;

    public Mono<Person> getPerson(String id) {

        return serviceGateway.getPerson(id);
    
    }

    public Mono<Float> getBalance(String id) {

        //Todo lo relacionado a la logica de mi aplicación con respecto al metodo obtener balance
        return serviceGateway.getBalance(id);
    }
}
