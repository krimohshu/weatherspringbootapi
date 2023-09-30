package com.natwest.controller;

import com.natwest.dto.WeatherInfoDTO;
import com.natwest.services.IWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherController {
    @Autowired
    private Environment env;

    @Autowired
    private IWeatherService weatherService;
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/getweatherinfo", method = RequestMethod.GET)
    public WeatherInfoDTO getWeatherInfo(@RequestParam(value = "location", required = false) String location
    ) {
        WeatherInfoDTO weather = weatherService.getWeather(location);
        return weather;
    }
}
