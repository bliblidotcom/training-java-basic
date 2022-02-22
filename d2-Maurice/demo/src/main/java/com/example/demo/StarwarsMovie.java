package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
//berguna untuk autowired, kalau class tidak dapat diubah, gunakan BeanConfig
public class StarwarsMovie {
    public List<String> getMovies(){
        List<String> movies = new ArrayList<>();

        movies.add("starwars Episode 1");
        movies.add("starwars Episode 2");
        movies.add("starwars Episode 3");

        return movies;
    }
}
