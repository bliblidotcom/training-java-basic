package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//class yang memakai dan dipakai perlu menambahkan @Component apabila tidak tercantum dalam BeanConfig
public class TheaterApp {
    @Autowired
    private StarwarsMovie starwarsMovie;

    @Value("${theater}")
    private String theater;

    public void getListMovie(){
        System.out.println("Theater app");
        System.out.println("============");

        starwarsMovie.getMovies().stream().forEach(movie -> System.out.println(movie));
    }
}
