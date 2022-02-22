package com.example.demo.model;

import com.example.demo.service.impl.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddMoviesRequest {
    private String movieName;

    public String getMovieName(){
        return movieName;
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }

}
