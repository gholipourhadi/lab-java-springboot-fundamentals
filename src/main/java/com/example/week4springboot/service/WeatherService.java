package com.example.week4springboot.service;

import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    private final Random random = new Random();

    public int getTemperature() {
        return random.nextInt(51) - 10;
    }

    public String getCondition() {
        String[] conditions = {"Sunny", "Rainy", "Cloudy", "Windy"};
        return conditions[random.nextInt(conditions.length)];
    }

    public int getWindSpeed() {
        return random.nextInt(101);
    }
}