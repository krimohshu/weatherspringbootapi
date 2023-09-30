package com.natwest.dto.legacy_weather_code;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonWeatheInfo {
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;

    @JsonProperty("generationtime_ms")
    private Double generationtime_ms;
    @JsonProperty("utc_offset_seconds")
    private Integer utc_offset_seconds;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("timezone_abbreviation")
    private String timezone_abbreviation;
    @JsonProperty("elevation")
    private Integer elevation;
}
