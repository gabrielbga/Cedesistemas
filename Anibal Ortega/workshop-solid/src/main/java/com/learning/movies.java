package com.learning;

import com.learning.service.MovieService;

public class movies {
    public static void main(String[] args){
        MovieService movieService = new MovieService();
        System.out.println("Movie is: " + movieService.allMovies());
        System.out.println("Duration movie is: " + movieService.durationMovie("Mad Max: Fury Road"));
        System.out.println("Overview movie is: " + movieService.overviewMovie("Mad Max: Fury Road"));

    }
}
