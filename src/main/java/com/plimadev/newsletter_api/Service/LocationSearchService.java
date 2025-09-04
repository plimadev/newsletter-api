package com.plimadev.newsletter_api.Service;


import com.plimadev.newsletter_api.Entity.Location.Location;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class LocationSearchService {

    private final WebClient webClient;
    private final String apiKey;


    public LocationSearchService(WebClient.Builder builder, @Value("${app.service.weather.token}") String apiKey) {
        this.webClient = builder.baseUrl("http://dataservice.accuweather.com").build();
        this.apiKey = apiKey;
    }


    public List<Location> locationSearch(String query){

        List<Location> response = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/locations/v1/cities/autocomplete")
                        .queryParam("apikey", apiKey)
                        .queryParam("q", query)
                        .build())
                .retrieve()
                .bodyToFlux(Location.class)
                .collectList()
                .block();
        
        return response;
    }
}
