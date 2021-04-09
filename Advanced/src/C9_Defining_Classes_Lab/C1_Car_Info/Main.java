package C9_Defining_Classes_Lab.C1_Car_Info;

import C9_Defining_Classes_Lab.C1_Car_Info.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        List<Car> out = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String[] p = scanner.nextLine().split(" ");
            String brand = p[1];
            String model = p[0];
            int horse = Integer.parseInt(p[2]);
            Car car = new Car();
            car.setModel(model);
            car.setBrand(brand);
            car.setHorsePower(horse);
            out.add(car);
        }for(Car t : out){
            System.out.println(t.carInfo ());
        }
    }
}
