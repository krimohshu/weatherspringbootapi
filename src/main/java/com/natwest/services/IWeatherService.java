package com.natwest.services;

import com.natwest.dto.WeatherInfoDTO;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public interface IWeatherService {
    public WeatherInfoDTO getWeather(String location) ;
}
