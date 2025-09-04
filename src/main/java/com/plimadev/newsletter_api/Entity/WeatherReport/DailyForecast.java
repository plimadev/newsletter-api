package com.plimadev.newsletter_api.Entity.WeatherReport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DailyForecast {

    @JsonProperty("Temperature")
    private Temperature temperature;

}
