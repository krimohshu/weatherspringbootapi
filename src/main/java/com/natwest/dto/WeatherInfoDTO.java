package com.natwest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherInfoDTO {
    @JsonProperty("location")
    private Location location;
    @JsonProperty("current")
    private Current current;
}
