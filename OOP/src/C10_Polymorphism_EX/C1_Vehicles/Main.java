package C10_Polymorphism_EX.C1_Vehicles;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] carInput = scanner.nextLine ().split (" ");
        String[] truckInput = scanner.nextLine ().split (" ");
        Car car = new Car (Double.parseDouble (carInput[1]),Double.parseDouble (carInput[2]));
        Truck truck = new Truck (Double.parseDouble (truckInput[1]),Double.parseDouble (truckInput[2]));
        int a = Integer.parseInt (scanner.nextLine ());
        for (int i = 0; i < a; i++) {
            String[] command = scanner.nextLine ().split (" ");
            double km = Double.parseDouble (command[2]);
            DecimalFormat patern = new DecimalFormat ("0.##");
            if(command[0].equals ("Drive")){
                if(command[1].equals ("Car")){
                    System.out.println (car.Drive (km));
                }else {
                    System.out.println (truck.Drive (km));
                }
            }else {
                if(command[1].equals ("Car")){
                    car.setFuelQuantity (car.Refuel (km));
                }else {
                    truck.setFuelQuantity (truck.Refuel (km));
                }
            }
        }
        System.out.println (car.toString ());
        System.out.println (truck.toString ());
    }
}
