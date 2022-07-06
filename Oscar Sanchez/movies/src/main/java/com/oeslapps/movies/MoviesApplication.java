package com.oeslapps.movies;

import com.oeslapps.movies.data.MovieDB;
import com.oeslapps.movies.data.MovieFileDB;
import com.oeslapps.movies.entities.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
		MovieDB movieDB = new MovieFileDB("movies.json");
		List<Movie> movies = movieDB.getMovies();
		for (Movie movie : movies) {
			System.out.println(movie);
		}
		System.out.println(movieDB.getMovie("0"));

	}

}
