package com.example.demo.model;

public class Rover {
    private int x;
    private int y;
    // "N" -> North, "E" -> East, "S" -> South, "W" -> West
    private String direction;

    // Default constructor: Set the starting state
    public Rover() {
        // Initialize x and y to 0, and direction to "N"
        this.x = 0;
        this.y = 0;
        this.direction = "N";
    }

    // Parameterized constructor: Initialize with specific values
    public Rover(int x, int y, String direction) {
        // Use 'this' keyword to store incoming parameters into class fields
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    // Setters and Getters
    public int getX() {
        // Use 'return' keyword to send the current X value back
        return this.x;
    }

    public void setX(int x) {
        // Update the internal X field with the new value provided
        this.x = x;
    }

    public int getY() {
        // Retrieve the current Y coordinate
        return this.y;
    }

    public void setY(int y) {
        // Update the internal Y field
        this.y = y;
    }

    public String getDirection() {
        // Provide the current cardinal direction to the caller
        return this.direction;
    }

    public void setDirection(String direction) {
        // Overwrite the old direction with the new one
        this.direction = direction;
    }
}
