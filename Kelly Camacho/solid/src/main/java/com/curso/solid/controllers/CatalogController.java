package com.curso.solid.controllers;

import com.curso.solid.models.Movie;
import com.curso.solid.services.interfaces.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CatalogController {
    @Autowired
    IMovieService _service;

    @RequestMapping(value = "/movies", method = RequestMethod.POST)
    public ResponseEntity<Object> createMovie(@RequestBody Movie movie) {
        _service.createMovie(movie);
        return new ResponseEntity<>("Movie created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public ResponseEntity<Object> getMovieByTitle(@RequestParam String title) {
        //_service.createMovie(movie);
        return new ResponseEntity<>("Title: ", HttpStatus.OK);
    }
}
