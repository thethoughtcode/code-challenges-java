package io.thoughtcode.java.exercism;

public class ElonsToyCar {

    static final int DRIVE_DISTANCE = 20;

    static final int BATTERY_USAGE = 1;

    private int distance;

    private int battery;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    ElonsToyCar() {
        this.distance = 0;
        this.battery = 100;
    }

    public String distanceDisplay() {
        return String.format("Driven %s meters", distance);
    }

    public String batteryDisplay() {

        final String display;

        if (battery == 0) {
            display = "Battery empty";
        } else {
            display = String.format("Battery at %s%%", battery);
        }

        return display;
    }

    public void drive() {
        if (battery != 0) {
            distance = distance + DRIVE_DISTANCE;
            battery = battery - BATTERY_USAGE;
        }
    }
}
