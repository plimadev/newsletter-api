package com.plimadev.newsletter_api.Entity.WeatherReport;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class WeatherReport {

    @JsonProperty("Headline")
    private Headline headline;

    @JsonProperty("DailyForecasts")
    private List<DailyForecast> dailyForecasts;

}
