package com.learning.model;

import java.util.List;

public class Movie {
    private boolean adult;
    private String original_language;
    private String original_title;
    private String overview;
    private int budget;
    public int duration;
    private List<Genre> genres;

    public Movie(boolean adult, String original_language, String original_title, String overview, int budget, int duration, List<Genre> genres) {
        this.adult = adult;
        this.original_language = original_language;
        this.original_title = original_title;
        this.overview = overview;
        this.budget = budget;
        this.duration = duration;
        this.genres = genres;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String getOverview() {
        return overview;
    }

    public int getBudget() {
        return budget;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "adult=" + adult +
                ", original_language='" + original_language + '\'' +
                ", original_title='" + original_title + '\'' +
                ", overview='" + overview + '\'' +
                ", budget=" + budget +
                ", genres=" + genres +
                '}';
    }
}
