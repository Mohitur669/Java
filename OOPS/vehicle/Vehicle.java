package vehicle;

//  Component of OOPS
public class Vehicle {
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

    public void print() {
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle Speed: " + maxSpeed);
    }
}