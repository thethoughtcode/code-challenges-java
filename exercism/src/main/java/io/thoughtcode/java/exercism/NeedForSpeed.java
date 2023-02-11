package io.thoughtcode.java.exercism;

class NeedForSpeed {

    static final int INITIAL_BATTERY = 100;

    static final int NITRO_SPEED = 50;

    static final int NITRO_BATTERY_DRAIN = 4;

    private final int speed;

    private final int batteryDrain;

    private int battery;

    private int distanceDriven;

    NeedForSpeed(final int speed, final int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = INITIAL_BATTERY;
        this.distanceDriven = 0;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            distanceDriven = distanceDriven + speed;
            battery = battery - batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(NITRO_SPEED, NITRO_BATTERY_DRAIN);
    }
}

class RaceTrack {

    private final int distance;

    RaceTrack(final int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(final NeedForSpeed car) {

        boolean canFinishTrack = isTrackCompleted(car);

        while (!car.batteryDrained()) {

            car.drive();

            if (isTrackCompleted(car)) {
                canFinishTrack = true;
                break;
            }
        }

        return canFinishTrack;
    }

    private boolean isTrackCompleted(final NeedForSpeed car) {
        return car.distanceDriven() >= distance;
    }
}
