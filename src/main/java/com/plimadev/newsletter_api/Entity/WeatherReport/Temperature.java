package com.plimadev.newsletter_api.Entity.WeatherReport;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Temperature {


    @JsonProperty("Minimum")
    private TemperatureValue minimum;

    @JsonProperty("Maximum")
    private TemperatureValue maximum;



}
