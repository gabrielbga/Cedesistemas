package com.learning.service;

import com.learning.model.Movie;
import com.learning.repository.MovieRepository;
import com.learning.repository.MovieRepositoryImpl;

import java.util.List;

public class MovieService {
    MovieRepository movieRepository = new MovieRepositoryImpl();
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public int durationMovie(String title){
        return movieRepository.viewDurationMovie(title);
    }

    public String overviewMovie(String title){
        return movieRepository.viewOverviewMovie(title);
    }
}
