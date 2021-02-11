import Vehicles.*;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Train ntinos_train = new Train(100);
        Scanner scanner = new Scanner(System.in);
        Car omophile_car = new Car(4, scanner.nextLine());

        omophile_car.honk();
        ntinos_train.honk();
        ntinos_train.numofseats();
        omophile_car.numofseats();
        scanner.close();
    }
}