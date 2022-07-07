package com.curso.solid.repository;

import com.curso.solid.models.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieRepository implements com.curso.solid.repository.interfaces.IMovieRepository {
    @Override
    public void createMovie(Movie movie){
        System.out.println("create movie: "+movie);
        //aqui deberia escribir en el json
    }

}