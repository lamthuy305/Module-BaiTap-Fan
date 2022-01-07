package com.codegym;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST  = 3;
    private int speed = this.SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        String text = "";

        String speeds = "";
        if (this.speed == 1) {
            speeds = "SLOW";
        } else if (this.speed == 2) {
            speeds = "MEDIUM";
        } else {
            speeds = "FAST";
        }

        if (this.on == true) {
            text = "Speed: "+ speeds + ", Color: " + this.color + ", Radius: " + this.radius + ", Fan is on";
        } else {
            text = "Speed: "+ speeds + ", Color: " + this.color + ", Radius: " + this.radius + ", Fan is off";
        }
        return text;
    }

}
