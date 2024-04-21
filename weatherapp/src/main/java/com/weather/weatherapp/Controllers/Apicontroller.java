package com.weather.weatherapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.weather.weatherapp.Service.weatherService;

@RestController
//@RequestMapping(path="/api/weather", produces="application/json")
public class Apicontroller {
   
    private  final weatherService weatherservice;

    @Autowired
    public Apicontroller(weatherService weatherservice){
        this.weatherservice = weatherservice;
    }

    @GetMapping ("/Weather/{location}")
    public String getWeatherForecast (@PathVariable String location){
        return weatherservice.getWeatherForecast(location);
    }
}
