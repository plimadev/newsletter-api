package com.plimadev.newsletter_api.Entity.Location;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Country {

    @JsonProperty("ID")
    private String id;

    @JsonProperty("LocalizedName")
    private String localizedName;

}
