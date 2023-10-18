package secondHomework;

import org.junit.jupiter.api.Test;
import org.secondHomework.Car;
import org.secondHomework.Motorcycle;
import org.secondHomework.Vehicle;

import static org.assertj.core.api.Assertions.assertThat;


public class VehicleTest {

    Car car = new Car("Toyota", "Corolla", 2005);
    Motorcycle motorcycle = new Motorcycle("IMZ-URAL", "Ural", 1980);

    @Test
    void carInstanceOfVehicle() {
        assertThat(car instanceof Vehicle);
    }

    @Test
    void carHasWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void motorcycleHasWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void carTestDrive() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void motorcycleTestDrive() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void carStopSpeed() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void motorcycleStopSpeed() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
