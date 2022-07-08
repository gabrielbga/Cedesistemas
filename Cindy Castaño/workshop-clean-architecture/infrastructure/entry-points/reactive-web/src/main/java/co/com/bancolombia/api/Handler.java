package co.com.bancolombia.api;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.usecase.moviesdata.MoviesDataUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {
    private final MoviesDataUseCase moviesDataUseCase;
    public Mono<ServerResponse> getMovie(ServerRequest serverRequest) {
        var movie = moviesDataUseCase.movieData(serverRequest.pathVariable("id"));
        return ServerResponse.ok().body(movie, Movie.class);
    }

    public Mono<ServerResponse> getMovieName(ServerRequest serverRequest) {
        var nameMovie = moviesDataUseCase.movieName(serverRequest.pathVariable("id"));
        return ServerResponse.ok().body(nameMovie,String.class);
    }
}
