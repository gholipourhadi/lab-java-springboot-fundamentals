package com.example.week4springboot.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.DayOfWeek;

@Service
public class TimeService {

    public String getCurrentTime() {
        return LocalTime.now().withNano(0).toString();
    }

    public String getCurrentDate() {
        return LocalDate.now().toString();
    }

    public String getCurrentDay() {
        return LocalDate.now().getDayOfWeek().toString();
    }
}