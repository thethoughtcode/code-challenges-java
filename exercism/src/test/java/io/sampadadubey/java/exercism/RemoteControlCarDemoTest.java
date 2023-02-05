package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

class RemoteControlCarDemoTest {

    @Test
    void race() {

        final ProductionRemoteControlCar productionCar = new ProductionRemoteControlCar();
        final ExperimentalRemoteControlCar experimentalCar = new ExperimentalRemoteControlCar();

        RemoteControlCarDemo.race((RemoteControlCar) productionCar);
        RemoteControlCarDemo.race((RemoteControlCar) productionCar);
        RemoteControlCarDemo.race((RemoteControlCar) experimentalCar);
        RemoteControlCarDemo.race((RemoteControlCar) experimentalCar);

        assertThat(experimentalCar.getDistanceTravelled() - productionCar.getDistanceTravelled()).isEqualTo(20);
    }

    @Test
    void rankCars() {

        final ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
        final ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();

        prc1.setNumberOfVictories(3);
        prc2.setNumberOfVictories(2);

        final List<ProductionRemoteControlCar> rankings = RemoteControlCarDemo.getRankedCars(prc1, prc2);

        assertThat(rankings.get(1)).isEqualTo(prc1);
    }

    @Test
    void ensureCarsAreComparables() {
        assertThat(RemoteControlCar.class).isAssignableFrom(ProductionRemoteControlCar.class);
    }
}
