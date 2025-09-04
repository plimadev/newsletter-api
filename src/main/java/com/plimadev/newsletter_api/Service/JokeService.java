package com.plimadev.newsletter_api.Service;

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

        Joke response = webClient.get()
                .uri("/jokes/random")
                .retrieve()
                .bodyToMono(Joke.class)
                .block();
        
        return response.getValue();
    }

    public List<String> getCategories() {
        return webClient.get()
                .uri("jokes/categories")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<String>>() {})
                .block();
    }

    public String getJokeByCategory(String category){
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("jokes/random")
                        .queryParam(category, "category")
                        .build())
                .retrieve()
                .bodyToMono(Joke.class)
                .map(Joke::getJoke)
                .block();
    }

}
