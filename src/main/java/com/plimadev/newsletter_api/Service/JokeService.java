package com.plimadev.newsletter_api.Service;

import com.plimadev.newsletter_api.Entity.Joke.Categories;
import com.plimadev.newsletter_api.Entity.Joke.Joke;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;


@Service
public class JokeService {

    private final WebClient webClient;

    public JokeService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.chucknorris.io").build();
    }

    public String getRandomJoke(){

        return webClient.get()
                .uri("/jokes/random")
                .retrieve()
                .bodyToMono(Joke.class)
                .map(Joke::getJoke)
                .block();
    }

    public List<String> getCategories() {
        return webClient.get()
                .uri("jokes/categories")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<String>>() {})
                .block();
    }

}
