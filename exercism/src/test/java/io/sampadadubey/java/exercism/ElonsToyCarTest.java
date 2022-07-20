package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ElonsToyCarTest {

    @Test
    public void buy_new_car_returns_instance() {

        final ElonsToyCar car = ElonsToyCar.buy();

        assertThat(car).isNotNull();
    }

    @Test
    public void buy_new_car_returns_new_car_each_time() {

        final ElonsToyCar car1 = ElonsToyCar.buy();
        final ElonsToyCar car2 = ElonsToyCar.buy();

        assertThat(car1).isNotEqualTo(car2);
    }

    @Test
    public void new_car_distance_display() {

        final ElonsToyCar car = new ElonsToyCar();

        assertThat(car.distanceDisplay()).isEqualTo("Driven 0 meters");
    }

    @Test
    public void new_car_battery_display() {

        final ElonsToyCar car = new ElonsToyCar();

        assertThat(car.batteryDisplay()).isEqualTo("Battery at 100%");
    }

    @Test
    public void distance_display_after_driving_once() {

        final ElonsToyCar car = new ElonsToyCar();

        car.drive();

        assertThat(car.distanceDisplay()).isEqualTo("Driven 20 meters");
    }

    @Test
    public void distance_display_after_driving_multiple_times() {

        final ElonsToyCar car = new ElonsToyCar();

        for (int index = 0; index < 17; index++) {
            car.drive();
        }

        assertThat(car.distanceDisplay()).isEqualTo("Driven 340 meters");
    }

    @Test
    public void battery_display_after_driving_once() {

        final ElonsToyCar car = new ElonsToyCar();

        car.drive();

        assertThat(car.batteryDisplay()).isEqualTo("Battery at 99%");
    }

    @Test
    public void battery_display_after_driving_multiple_times() {

        final ElonsToyCar car = new ElonsToyCar();

        for (int index = 0; index < 23; index++) {
            car.drive();
        }

        assertThat(car.batteryDisplay()).isEqualTo("Battery at 77%");
    }

    @Test
    public void battery_display_when_battery_empty() {

        final ElonsToyCar car = new ElonsToyCar();

        // Drain the battery
        for (int index = 0; index < 100; index++) {
            car.drive();
        }

        // Attempt to drive one more time (should not work)
        car.drive();

        assertThat(car.batteryDisplay()).isEqualTo("Battery empty");
    }

    @Test
    public void distance_display_when_battery_empty() {

        final ElonsToyCar car = new ElonsToyCar();

        // Drain the battery
        for (int index = 0; index < 100; index++) {
            car.drive();
        }

        // Attempt to drive one more time (should not work)
        car.drive();

        assertThat(car.distanceDisplay()).isEqualTo("Driven 2000 meters");
    }
}
