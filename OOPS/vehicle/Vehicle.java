package vehicle;

//  Component of OOPS
public  class Vehicle {
    //    String color;
//    String color is package friendly --> Means only accessible in same package
    protected String color;
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /* Abstract Class:
     for this we also need to declare the Vehicle class to abstract
     abstract class is an incomplete class, so for that reason the creating a Vehicle object will not work in VehicleUse
     e.g "Vehicle car = new Vehicle();" this will not work anymore after declaring the Vehicle class abstract
     but we can use "Vehicle v = new Car();" because in this case we are not creating the Vehicle object */

//    public abstract boolean isMotorized();

    public void print() {
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle Speed: " + maxSpeed);
    }
}