package com.plimadev.newsletter_api.Entity.Location;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Location {

    @JsonProperty("Key")
    private String key;

    @JsonProperty("LocalizedName")
    private String localizedName;

    @JsonProperty("Country")
    private Country country;

}
