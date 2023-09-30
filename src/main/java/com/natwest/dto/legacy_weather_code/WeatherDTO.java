package com.natwest.dto.legacy_weather_code;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.natwest.dto.legacy_weather_code.CommonWeatheInfo;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherDTO {
    //private String testResponse;

//    @JsonProperty("latitude")
//    private Double latitude;
//    @JsonProperty("longitude")
//    private Double longitude;
//
//    @JsonProperty("generationtime_ms")
//    private Double generationtime_ms;
//    @JsonProperty("utc_offset_seconds")
//    private Integer utc_offset_seconds;
//    @JsonProperty("timezone")
//    private String timezone;
//    @JsonProperty("timezone_abbreviation")
//    private String timezone_abbreviation;
//    @JsonProperty("elevation")
//    private Integer elevation;

//    @JsonProperty("latitude")
    private CommonWeatheInfo commonWeatheInfo;
//    private CurrentWeather currentWeather;
//    private Hourly hourly;
//    private HourlyUnits hourlyUnits;
//    private Relativehumidity2M relativehumidity2M;
//    private Temperature2M temperature2M;
//    private Windspeed10M windspeed10M;

}
