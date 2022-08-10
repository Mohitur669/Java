package vehicle;

public class Car extends Vehicle {
    int numGears;
    boolean isConvertible;

    public void printCar() {
        System.out.println("Car Color: " + color);
        System.out.println("Car Max Speed: " + getMaxSpeed());
        System.out.println("Car numGears: " + numGears);
        System.out.println("Car isConvertible: " + isConvertible);
//        'super' keyword help to access the function of the parent class
//        super.print();
        System.out.println("Vehicle Max Speed: " + super.getMaxSpeed());
    }
    public boolean isConvertible(){
        return isConvertible;
    }
}