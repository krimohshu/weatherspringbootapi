package com.natwest.services;

import com.natwest.dto.legacy_weather_code.WeatherDTO;
import com.natwest.dto.WeatherInfoDTO;
import com.natwest.util.StringOperationUtil;
import com.natwest.util.UrlUtil;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Map;


@Service
public class WeatherService implements IWeatherService {

    @Autowired
    private Environment env;

    @Override
    public WeatherInfoDTO getWeather(String location) {

        // Call third party service to get weather
        getWeatherFromExternalSource(location );
        //   String testResponse = "Test Response from Service";

        WeatherDTO weatherDTO = new WeatherDTO();
       // weatherDTO.setTestResponse("hi");

        return getWeatherFromExternalSource(location);
    }

//    private ResponseEntity<List<WeatherDTO>>  getWeatherFromExternalSource(String location, String name) {
//        RestTemplate restTemplate = new RestTemplate();
//        final String weatherURL = env.getProperty("weatherportal.url");
//        ResponseEntity<List<WeatherDTO>> weatherResponse =
//                restTemplate.exchange(weatherURL,
//                        HttpMethod.GET, null, new ParameterizedTypeReference<List<WeatherDTO>>() {
//                        });
//        List<WeatherDTO> weatherDTO = weatherResponse.getBody();
//        //System.out.println(weatherDTO.toString());
//        return weatherResponse;
//    }

    private WeatherInfoDTO getWeatherFromExternalSource(String location) {
        //ResponseEntity<WeatherDTO> response = null;
        WeatherInfoDTO response = null;
        final String protocol = env.getProperty("protocol");
        final String host = env.getProperty("host");
        final String path = env.getProperty("urlpath");
        String parametersWithOutLocation = env.getProperty("urlparameters");
        System.out.println("What is my loc" + location);
        String parameters  = parametersWithOutLocation.replace("location_to_replaced", location);

        Map<String , String> parameterMap = StringOperationUtil.convertStringToMap(parameters , "&");
        parameterMap.put("key",System.getenv("apikey"));
        System.out.println("parameterMap" + parameterMap);
        System.out.println("apikey" + System.getenv("apikey"));
        URL weatherUrl = UrlUtil.buildUrl(protocol,host , path , parameterMap);
        System.out.println("url: " + weatherUrl.toString());

     //   System.out.println(weatherURL);

        RestTemplate restTemplate = new RestTemplate();
        try {
          //  response = restTemplate.getForObject(weatherURL, WeatherDTO.class);
           // response = restTemplate.getForObject(weatherURL, WeatherInfoDTO.class);
            response = restTemplate.getForObject(weatherUrl.toString(), WeatherInfoDTO.class);
           // String getWeatherResponse = restTemplate.getForObject("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current_weather=true&hourly=temperature_2m,relativehumidity_2m,windspeed_10m", String.class);
            System.out.println("This is response from url: " + response.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(response.toString());

        return response;
    }
}
