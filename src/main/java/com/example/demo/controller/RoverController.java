package com.example.demo.controller;

import com.example.demo.model.Rover;
import com.example.demo.service.RoverService;
import org.springframework.web.bind.annotation.*;

// Mark this class as a RESTful web controller that returns JSON
@RestController
// Define the base URL path for all endpoints
@RequestMapping("/api")
public class RoverController {

    private final RoverService roverService;

    // Constructor Injection
    public RoverController(RoverService roverService) {
        // Store the injected service
        this.roverService = roverService;
    }

    // Endpoint: Get current status
    // HTTP GET is best for retrieving data
    @GetMapping("/status")
    public Rover getStatus() {
        return roverService.getRoverStatus();
    }

    // Endpoint: Send commands
    // HTTP POST is appropriate for submitting commands
    @PostMapping("/move")
    public Rover moveRover(
            // Extract the 'commands' value from URL query parameters
            @RequestParam String commands
    ) {
        return roverService.processCommands(commands);
    }

    // Endpoint: Reset
    // POST triggers an action
    @PostMapping("/reset")
    public Rover resetRover() {
        return roverService.resetRover();
    }
}
