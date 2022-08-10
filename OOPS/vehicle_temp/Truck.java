package vehicle_temp;

import vehicle.Vehicle;

public class Truck extends Vehicle {
    public int maxLoadingCapacity;

    public void print() {
        System.out.println("Truck Capacity: " + maxLoadingCapacity);
        System.out.println("Truck Speed: " + getMaxSpeed());
        System.out.println("Truck Color: " + color);

    }
}