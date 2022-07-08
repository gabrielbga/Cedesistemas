package co.com.bancolombia.model.movie.gateways;

import co.com.bancolombia.model.movie.Movie;
import reactor.core.publisher.Mono;

public interface MovieRepository {
    Mono<Movie> getMovie(String id);
    Mono<String> getNameMovie(String id);
}
