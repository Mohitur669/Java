package vehicle;

import vehicle_temp.Truck;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.color = "Matte Black";
//        car.print();
        Car c = new Car();
        c.numGears = 2;
        c.setMaxSpeed(13);
//        color and print was in vehicle, but we extended the car class to vehicle
//        that's why we can use the vehicles property in the car class
//        In other words the 'vehicle' is parent class and the 'car' is child class
        c.color = "Black";
//        c.print();
//        c.printCar();
        Truck truck1 = new Truck();
        truck1.color = "Grey";
        truck1.maxLoadingCapacity = 5;
        truck1.setMaxSpeed(14);
        c.setMaxSpeed(10);
        car.setMaxSpeed(56);
        c.print();
        truck1.print();
        car.print();
    }
}