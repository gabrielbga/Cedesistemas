package com.oeslapps.movies.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private String id;
    private boolean adult;
    private String original_language;
    private String original_title;
    private String overview;
    private String budget;
    private Genre[] genres;

    @Override
    public String toString() {
        String g = "";
        for (Genre gen : genres) {
            g += gen +",";
        }

        return "Movie{" +
                "id='" + id + '\'' +
                ", adult=" + adult +
                ", original_language='" + original_language + '\'' +
                ", original_title='" + original_title + '\'' +
                ", overview='" + overview + '\'' +
                ", budget='" + budget + '\'' +
                ", genres=[" + g + "]" +
                '}';
    }

    public void updateValues(Movie movie){
        this.id = movie.getId();
        this.adult = movie.isAdult();
        this.original_language = movie.getOriginal_language();
        this.original_title = movie.getOriginal_title();
        this.overview = movie.getOverview();
        this.budget = movie.getBudget();
        this.genres = movie.getGenres();
    }
}
