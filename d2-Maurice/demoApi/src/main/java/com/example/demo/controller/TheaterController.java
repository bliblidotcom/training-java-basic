package com.example.demo.controller;

import com.example.demo.model.AddMoviesRequest;
import com.example.demo.service.impl.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class TheaterController {

    @Autowired
    private TheaterService theaterService;

    @RequestMapping(method = RequestMethod.GET, value = "/movies")
    public List<String> getMovies() {
        return theaterService.getMovies();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/movies-with-param")
    public boolean addMovies(@RequestParam String movie) {
        return theaterService.addMovie(movie);
    }

    @PostMapping(value = "/movies-with-body", consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean addMovies(@RequestBody AddMoviesRequest movie) {
        return theaterService.addMovie(movie.getMovieName());
    }

//    @PutMapping(value = "/movies", consumes = MediaType.APPLICATION_JSON_VALUE)
    //this cause problem because params sent not JSON
    @PutMapping(value = "/movies")
    public boolean editMovies(@RequestParam String movieName, @RequestParam int index){
        return theaterService.replaceMovie(movieName, index);
    }

    @DeleteMapping(value = "/movies")
    public boolean deleteMovie(){
        return theaterService.deleteAllMovie();
    }
}
