package vehicle;

public class Car extends Vehicle {
    int numGears;
    boolean isConvertible;

    /* Car extends the Vehicle class so that the Car class also becomes incomplete, so can have two types of solution -
     * 1. declare the Car class to abstract, but this also create a new problem that now you also cannot Create new Car objects
     * 2. So the best option is to remove the incompleteness from Car class
     * to do that we override the isMotorized property, now we can create new Car objects without any problem */

//    @Override
//    public boolean isMotorized() {
//        return false;
//    }

    public void printCar() {
        System.out.println("Car Color: " + color);
        System.out.println("Car Max Speed: " + getMaxSpeed());
        System.out.println("Car numGears: " + numGears);
        System.out.println("Car isConvertible: " + isConvertible);
//        'super' keyword help to access the function of the parent class
//        super.print();
        System.out.println("Vehicle Max Speed: " + super.getMaxSpeed());
    }

    public boolean isConvertible() {
        return isConvertible;
    }
}