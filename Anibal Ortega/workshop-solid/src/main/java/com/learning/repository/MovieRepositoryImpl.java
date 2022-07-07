package com.learning.repository;

import com.learning.model.Genre;
import com.learning.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepositoryImpl implements MovieRepository{
    @Override
    public List<Movie> findAll() {
        List<Movie> allMovies = getMovies();
        return allMovies;
    }

    private List<Movie> getMovies() {
        List<Genre> genres = new ArrayList<>();
        genres.add(new Genre(28, "Action"));
        genres.add(new Genre(12, "Adventure"));
        genres.add(new Genre(878, "Science Fiction"));
        List<Movie> allMovies = new ArrayList<>();
        allMovies.add(new Movie(false,"en", "Mad Max: Fury Road","An apocalyptic story set in the furthest reaches of our planet, in a stark desert landscape where humanity is broken, and most everyone is crazed fighting for the necessities of life. Within this world exist two rebels on the run who just might be able to restore order",
                150000000,120,genres));
        return allMovies;
    }

    @Override
    public void updateMovie(Movie movie) {

    }

    @Override
    public int viewDurationMovie(String title) {
        List<Movie> allMovies = getMovies();
        return allMovies.get(0).getDuration();
    }

    @Override
    public String viewOverviewMovie(String title) {
        List<Movie> allMovies = getMovies();
        return allMovies.get(0).getOverview();
    }
}
