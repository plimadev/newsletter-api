package com.plimadev.newsletter_api.Entity.WeatherReport;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Headline {

    @JsonProperty("Text")
    private String text;

    @JsonProperty("Category")
    private String category;


}
