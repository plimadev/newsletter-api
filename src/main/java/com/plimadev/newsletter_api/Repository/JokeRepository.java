package com.plimadev.newsletter_api.Repository;

import com.plimadev.newsletter_api.Entity.Joke.Joke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JokeRepository extends JpaRepository<Joke, Long> {

    List<Joke> findAll();
    Joke findByJokeCategory(String category);
}
