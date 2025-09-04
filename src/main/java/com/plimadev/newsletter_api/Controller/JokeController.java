package com.plimadev.newsletter_api.Controller;

import com.plimadev.newsletter_api.Service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jokes")
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/randomJoke")
    public String getRandomJoke(){
        return jokeService.getRandomJoke();
    }

    @GetMapping("/categories")
    public List<String> getCategories(){
        return jokeService.getCategories();
    }

    @GetMapping("/{category}")
    public String getJokeByCategory(@PathVariable String category) {
        return jokeService.getJokeByCategory(category);
    }
}
