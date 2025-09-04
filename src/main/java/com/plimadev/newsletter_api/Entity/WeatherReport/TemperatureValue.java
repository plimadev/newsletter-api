package com.plimadev.newsletter_api.Entity.WeatherReport;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TemperatureValue {

    @JsonProperty("Value")
    private double value;

    @JsonProperty("Unit")
    private String unit;

    @JsonProperty("UnitType")
    private int unitType;
}
