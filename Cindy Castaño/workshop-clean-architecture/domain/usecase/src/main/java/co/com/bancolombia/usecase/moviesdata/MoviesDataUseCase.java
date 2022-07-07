package co.com.bancolombia.usecase.moviesdata;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class MoviesDataUseCase {
    private final MovieRepository movieRepository;

    public Mono<Movie> movieData(String id){
        return movieRepository.getMovie(id);
    }

    public Mono<String> movieName(String id){
        return movieRepository.getNameMovie(id);
    }
}
