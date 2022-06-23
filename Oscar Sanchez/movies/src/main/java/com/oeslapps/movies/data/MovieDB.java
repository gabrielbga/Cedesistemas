package com.oeslapps.movies.data;

import com.oeslapps.movies.entities.Movie;

import java.util.List;

public interface MovieDB {
    public List<Movie> getMovies();
    public Movie getMovie(String id);
    public void updateMovie(Movie movie);
}
