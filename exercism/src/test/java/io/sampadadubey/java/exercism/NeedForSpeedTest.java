package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class NeedForSpeedTest {

    @Test
    void new_remote_control_car_has_not_driven_any_distance() {

        final int speed = 10;
        final int batteryDrain = 2;
        final NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        assertThat(car.distanceDriven()).isEqualTo(0);
    }

    @Test
    void drive_increases_distance_driven_with_speed() {

        final int speed = 5;
        final int batteryDrain = 1;
        final NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        car.drive();

        assertThat(car.distanceDriven()).isEqualTo(5);
    }

    @Test
    void drive_does_not_increase_distance_driven_when_battery_drained() {

        final int speed = 9;
        final int batteryDrain = 50;
        final NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        // Drain the battery
        car.drive();
        car.drive();

        // One extra drive attempt (should not succeed)
        car.drive();

        assertThat(car.distanceDriven()).isEqualTo(18);
    }

    @Test
    void new_remote_control_car_battery_is_not_drained() {

        final int speed = 15;
        final int batteryDrain = 3;
        final NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        assertThat(car.batteryDrained()).isFalse();
    }

    @Test
    void drive_to_almost_drain_battery() {

        final int speed = 2;
        final int batteryDrain = 1;
        final NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        // Almost drain the battery
        for (int index = 0; index < 99; index++) {
            car.drive();
        }

        assertThat(car.batteryDrained()).isFalse();
    }

    @Test
    void drive_until_battery_is_drained() {

        final int speed = 2;
        final int batteryDrain = 1;
        final NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        // Drain the battery
        for (int index = 0; index < 100; index++) {
            car.drive();
        }

        assertThat(car.batteryDrained()).isTrue();
    }

    @Test
    void nitro_car_has_not_driven_any_distance() {
        final NeedForSpeed car = NeedForSpeed.nitro();
        assertThat(car.distanceDriven()).isEqualTo(0);
    }

    @Test
    void nitro_car_has_battery_not_drained() {
        NeedForSpeed car = NeedForSpeed.nitro();
        assertThat(car.batteryDrained()).isFalse();
    }

    @Test
    void nitro_car_has_correct_speed() {
        final NeedForSpeed car = NeedForSpeed.nitro();
        car.drive();
        assertThat(car.distanceDriven()).isEqualTo(50);
    }

    @Test
    void nitro_has_correct_battery_drain() {

        final NeedForSpeed car = NeedForSpeed.nitro();

        // The battery is almost drained
        for (int index = 0; index < 24; index++) {
            car.drive();
        }

        assertThat(car.batteryDrained()).isFalse();

        // Drain the battery
        car.drive();

        assertThat(car.batteryDrained()).isTrue();
    }

    @Test
    void car_can_finish_with_car_that_can_easily_finish() {

        final int speed = 10;
        final int batteryDrain = 2;
        final NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        final int distance = 100;
        final RaceTrack race = new RaceTrack(distance);

        assertThat(race.tryFinishTrack(car)).isTrue();
    }

    @Test
    void car_can_finish_with_car_that_can_just_finish() {

        final int speed = 2;
        final int batteryDrain = 10;
        final NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        final int distance = 20;
        final RaceTrack race = new RaceTrack(distance);

        assertThat(race.tryFinishTrack(car)).isTrue();
    }

    @Test
    void car_can_finish_with_car_that_just_cannot_finish() {

        final int speed = 3;
        final int batteryDrain = 20;
        final NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        final int distance = 16;
        final RaceTrack race = new RaceTrack(distance);

        assertThat(race.tryFinishTrack(car)).isFalse();
    }

    @Test
    void car_can_finish_with_car_that_cannot_finish() {

        final int speed = 1;
        final int batteryDrain = 20;
        final NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        final int distance = 678;
        final RaceTrack race = new RaceTrack(distance);

        assertThat(race.tryFinishTrack(car)).isFalse();
    }
}
