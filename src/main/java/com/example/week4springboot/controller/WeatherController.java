package com.example.week4springboot.controller;

import com.example.week4springboot.service.WeatherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/temperature")
    public String temperature() {
        return weatherService.getTemperature() + " °C";
    }

    @GetMapping("/condition")
    public String condition() {
        return weatherService.getCondition();
    }

    @GetMapping("/wind")
    public String wind() {
        return weatherService.getWindSpeed() + " km/h";
    }

    @GetMapping("/all")
    public String allWeather() {
        return "Temp: " + weatherService.getTemperature()
                + " °C, Condition: " + weatherService.getCondition()
                + ", Wind: " + weatherService.getWindSpeed() + " km/h";
    }
}