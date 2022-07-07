package co.com.bancolombia.personservice;

import co.com.bancolombia.model.person.Person;
import co.com.bancolombia.model.person.gateways.PersonService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
// TODO Explicación de inyeccion de dependnecias por constructor se agrega la anotación @Service para que se inicialice el Bean y lo inyecte
@Service
public class ApiPersonService implements PersonService {
    @Override
    public Mono<Person> getPerson(String id) {
        return Mono.just(Person.builder().id(id).name("Nombre Prueba").balance(650000f).build());

    }

    @Override
    public Mono<Float> getBalance(String id) {
        return Mono.just(650000f);
    }
}
