package com.learning.repository;

import com.learning.model.Movie;

import java.util.List;

public interface MovieRepository {
    List<Movie> findAll();
    void updateMovie(Movie movie);
    int viewDurationMovie(String title);
    String viewOverviewMovie(String title);
}
