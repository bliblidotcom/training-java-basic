package com.example.demo.service.impl;

import java.util.List;

public interface TheaterService {

    List<String> getMovies();

    boolean addMovie(String movie);

    boolean replaceMovie(String movieName, int index);

    public boolean deleteAllMovie();
}
