package com.natwest.dto.legacy_weather_code;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.LinkedHashMap;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hourly {
    private LinkedHashMap<Integer, String> hourlyTime = new LinkedHashMap<Integer, String>();
}
