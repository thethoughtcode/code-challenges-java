package io.thoughtcode.java.exercism;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class RemoteControlCarDemo {

    private RemoteControlCarDemo(){
    }

    public static void race(final RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(final ProductionRemoteControlCar prc1,
                                                                 final ProductionRemoteControlCar prc2) {
        return Arrays.asList(prc1, prc2)
                     .stream()
                     .sorted((car1, car2) -> car1.getNumberOfVictories() - car2.getNumberOfVictories())
                     .collect(Collectors.toList());
    }
}

interface RemoteControlCar {
    void drive();
}


class ExperimentalRemoteControlCar implements RemoteControlCar {

    static final int DEFAULT_DRIVE_DISTANCE = 20;

    private int distanceDriven;

    @Override
    public void drive() {
        distanceDriven = distanceDriven + DEFAULT_DRIVE_DISTANCE;
    }

    public int getDistanceTravelled() {
        return distanceDriven;
    }
}

class ProductionRemoteControlCar implements RemoteControlCar {

    private static final int DEFAULT_DRIVE_DISTANCE = 10;

    private int distanceDriven;

    private int numberOfVictories;

    @Override
    public void drive() {
        distanceDriven = distanceDriven + DEFAULT_DRIVE_DISTANCE;
    }

    public int getDistanceTravelled() {
        return distanceDriven;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(final int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
}
