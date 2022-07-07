package co.com.bancolombia.movie;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class MovieServices implements MovieRepository {
    @Override
    public Mono<Movie> getMovie(String id) {
        Movie movie = Movie.builder().id("AB10").name("Thor").description("Thor and Loki always").duration(100).build();
        return Mono.just(movie);
    }

    @Override
    public Mono<String> getNameMovie(String id) {
        Movie movie = Movie.builder().id("AB10").name("Thor").description("Thor and Loki always").duration(100).build();
        return Mono.just(movie.getName());
    }
}
