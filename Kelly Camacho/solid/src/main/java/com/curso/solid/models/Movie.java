package com.curso.solid.models;

import java.math.BigInteger;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
    private boolean adult;
    private String original_language;
    private String original_title;
    private String overview;
    private BigInteger budget;
    private Genre mainGenre;
    private List<Genre> genres;

}
