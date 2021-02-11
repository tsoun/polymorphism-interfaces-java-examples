package Vehicles;

public class Car extends Vehicle {
    String owner;

    public Car(int seats, String owner) {
        super(seats);
        this.owner = owner;
    }

    public void honk() {
        System.out.println("BROOOOOOM " + this.owner);
    }
}
