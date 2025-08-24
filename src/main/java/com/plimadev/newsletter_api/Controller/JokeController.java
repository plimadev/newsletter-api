package com.plimadev.newsletter_api.Controller;

import com.plimadev.newsletter_api.Service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/jokes")
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }


    @GetMapping("/random")
    public String getRandomJoke(){
        return jokeService.getRandomJoke();
    }

    @GetMapping("/categories")
    public List<String> getCategories(){
        return jokeService.getCategories();
    }
}
