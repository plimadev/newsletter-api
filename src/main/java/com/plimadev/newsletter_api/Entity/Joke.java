package com.plimadev.newsletter_api.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Joke {

    @JsonProperty("value")
    private String joke;

    public String getJoke() {
        return joke;
    }
}
