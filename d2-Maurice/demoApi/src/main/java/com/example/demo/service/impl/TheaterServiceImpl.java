package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterServiceImpl implements TheaterService{
    List<String> movies = new ArrayList<>();

    public TheaterServiceImpl(){
        movies.add("deez nut");
    }

    @Autowired
    public List<String> getMovies(){
//        movies.add("Starwars 1");
        return movies;
    }

    public boolean addMovie(String movie){
        movies.add(movie);
        return true;
    }

    public boolean replaceMovie(String movie, int index){
        movies.set(index, movie);
        return true;
    }

    public boolean deleteAllMovie(){
        movies.clear();
        return true;
    }
}
