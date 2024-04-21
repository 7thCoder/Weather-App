package com.weather.weatherapp.Service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class weatherService {
    private final String API_URL = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/weatherdata/forecast";

    private final String API_KEY = "TDBDP6UT7Q8ME2DC4FHK9W4H6";

    private final RestTemplate rest;


    public weatherService(RestTemplate rest) {
        this.rest = rest;
    }

    public String getWeatherForecast(String location){
        String url = String.format("%s?locations=%s&aggregateHours=24&shortColumnNames=false&contentType=csv&key=%s", API_URL, location, API_KEY);
        return rest.getForObject(url, String.class);
    }
}
