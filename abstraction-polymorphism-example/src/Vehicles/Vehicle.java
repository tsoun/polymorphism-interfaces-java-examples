package Vehicles;

public abstract class Vehicle {
    public int seats;

    public Vehicle(int seats) {
        this.seats = seats;
    }

    public void numofseats() {
        System.out.println("Number of seats is " + this.seats);
    }

    public void honk() {
        System.out.println("TOUTOUT");
    }
}
