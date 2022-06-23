package com.oeslapps.movies.data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oeslapps.movies.entities.Movie;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MovieFileDB implements MovieDB{

    private String filePath;
    private Gson gson;

    public MovieFileDB(String filePath) {
        this.filePath = filePath;
        this.gson = new Gson();
    }

    @Override
    public List<Movie> getMovies() {
        String fileContent = readFile(this.filePath);
        return parseFileContent(fileContent);
    }

    @Override
    public Movie getMovie(String id) {
        List<Movie> movies = this.getMovies();
        Optional<Movie> movieById = movies.stream().filter(movie -> movie.getId().equals(id)).findFirst();
        return movieById.orElse(null);
    }

    @Override
    public void updateMovie(Movie movie) {
        List<Movie> movies = this.getMovies();
        Optional<Movie> movieById = movies.stream().filter(m -> m.getId().equals(movie.getId())).findFirst();
        movie = movieById.orElse(null);
    }

    public String readFile(String filePath){
        Path path = Path.of(filePath);
        String content = "";
        try {
            content = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public List<Movie> parseFileContent(String content){
        Type movieListType = new TypeToken<ArrayList<Movie>>(){}.getType();
        return gson.fromJson(content, movieListType);
    }
}
