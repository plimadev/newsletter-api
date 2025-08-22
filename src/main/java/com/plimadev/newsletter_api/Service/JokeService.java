package com.plimadev.newsletter_api.Service;

import com.plimadev.newsletter_api.Entity.Joke;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class JokeService {

    private final WebClient webClient;

    public JokeService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.chucknorris.io").build();
    }

    public Mono<String> getRandomJoke(){

        return webClient.get()
                .uri("/jokes/random")
                .retrieve()
                .bodyToMono(Joke.class)
                .map(Joke::getJoke);

    }

}
