/*
The functions created in the interface are already abstract by default.
Some properties of interface -
 1. An interface can extend another interface
 2. A class can only extends class only one time, but can implement multiple interfaces
 3. A class can extend a class and also can implement interface at the same time
 */

package Interfaces;

public interface VehicleInterface{
    public int getMaxSpeed();
    public void print();
}