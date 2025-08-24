package com.plimadev.newsletter_api.Entity.Joke;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

//check why I needed to add the getter manually
@Data
public class Joke {

    @JsonProperty("value")
    private String joke;

}
