package com.natwest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Current {
    @JsonProperty("condition")
    private Condition condition;
    @JsonProperty("last_updated_epoch")
    private String last_updated_epoch;
    @JsonProperty("last_updated")
    private String last_updated;
    @JsonProperty("temp_c")
    private String temp_c;
    @JsonProperty("temp_f")
    private String temp_f;
    @JsonProperty("is_day")
    private String is_day;
    @JsonProperty("wind_mph")
    private String wind_mph;
    @JsonProperty("wind_kph")
    private String wind_kph;
    @JsonProperty("wind_degree")
    private String wind_degree;
    @JsonProperty("wind_dir")
    private String wind_dir;
    @JsonProperty("pressure_mb")
    private String pressure_mb;
    @JsonProperty("pressure_in")
    private String pressure_in;
    @JsonProperty("precip_mm")
    private String precip_mm;
    @JsonProperty("precip_in")
    private String precip_in;
    @JsonProperty("humidity")
    private String humidity;
    @JsonProperty("cloud")
    private String cloud;
    @JsonProperty("feelslike_c")
    private String feelslike_c;
    @JsonProperty("feelslike_f")
    private String feelslike_f;
    @JsonProperty("vis_km")
    private String vis_km;
    @JsonProperty("vis_miles")
    private String vis_miles;
    @JsonProperty("uv")
    private String uv;
    @JsonProperty("gust_mph")
    private String gust_mph;
    @JsonProperty("gust_kph")
    private String gust_kph;
}
