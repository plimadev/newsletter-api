package com.plimadev.newsletter_api.Entity.Joke;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Table(name = "jokes")
@Entity
public class Joke {

    @Id
    private String id;


    @Column(name = "joke")
    private String value;

    @Column(name = "category")
    private String jokeCategory;

}
