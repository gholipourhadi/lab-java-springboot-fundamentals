package com.example.week4springboot.controller;

import com.example.week4springboot.service.TimeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/time")
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String time() {
        return timeService.getCurrentTime();
    }

    @GetMapping("/date")
    public String date() {
        return timeService.getCurrentDate();
    }

    @GetMapping("/day")
    public String day() {
        return timeService.getCurrentDay();
    }

    @GetMapping("/all")
    public String all() {
        return "Time: " + timeService.getCurrentTime()
                + ", Date: " + timeService.getCurrentDate()
                + ", Day: " + timeService.getCurrentDay();
    }
}