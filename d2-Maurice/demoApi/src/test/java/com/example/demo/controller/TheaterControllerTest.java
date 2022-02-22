package com.example.demo.controller;

import com.example.demo.model.AddMoviesRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//enable integration test di spring
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TheaterControllerTest {

    // class for execute HTTP request in integration test
    //web test client hanya tersedia di spring 5
    @Autowired
    private WebTestClient webTestClient;

    // best practice :
    // {feature}_{condition}_{expected}

    //stepnya
    // 1. Configure HTTP yang bakal dipanggil, method dan urinya apa
    // 2. exchange -> execute HTTP yang kita configure
    // 3. Assertion untuk HTTP status
    // 4. Assertion untuk HTTP response

    @Test
    public void getMovie_shouldReturnCorrectValue() {
        String expectedValue = "deez nut";
        webTestClient.get()
                .uri("/movies")
                .exchange()
                .expectStatus()
                .is2xxSuccessful()
                .expectBody(new ParameterizedTypeReference<List<String>>() {
                })
                .value(movie -> {
                    assertFalse(movie.isEmpty());
                    assertEquals(expectedValue, movie.get(0));
                });
    }

    @Test
    public void addMovieParam_shouldAddCorrectMovieToList() {
        String request = ("deez nut 2");

        webTestClient.post()
                .uri("/movies-with-param?movie=".concat(request))
                .exchange()
                .expectStatus()
                .is2xxSuccessful()
                .expectBody(Boolean.class)
                .value(result -> assertTrue(result));
    }

    @Test
    public void addMovie_shouldAddCorrectMovieToList() {
        AddMoviesRequest request = new AddMoviesRequest();
        request.setMovieName("deez nut 2");

        webTestClient.post()
                .uri("/movies-with-body")
                .body(Mono.just(request), AddMoviesRequest.class)
                .exchange()
                .expectStatus()
                .is2xxSuccessful()
                .expectBody(Boolean.class)
                .value(result -> assertTrue(result));
    }

    //for uri, you can use uri builder, etc
    @Test
    public void editMovie_shouldEditMovieCorrectly() {
        webTestClient.put()
                .uri("/movies?movieName={movieName}&index={index}", "deezNut2", 0)
                .exchange()
                .expectStatus()
                .is2xxSuccessful()
                .expectBody(Boolean.class)
                .value(result -> assertTrue(result));
    }

    @Test
    public void deleteMovie_shouldClearAllMovies() {
        webTestClient.delete()
                .uri("/movies")
                .exchange()
                .expectStatus()
                .is2xxSuccessful()
                .expectBody(Boolean.class)
                .value(result -> assertTrue(result));
    }
}