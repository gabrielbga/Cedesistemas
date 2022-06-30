package com.curso.solid.services;

import com.curso.solid.models.Movie;
import com.curso.solid.repository.interfaces.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService implements com.curso.solid.services.interfaces.IMovieService {

    @Autowired
    private IMovieRepository _repository;

    @Override
    public void createMovie(Movie movie){
        _repository.createMovie(movie);
    }


}
