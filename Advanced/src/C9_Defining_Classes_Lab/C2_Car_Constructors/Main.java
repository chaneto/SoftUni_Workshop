package C9_Defining_Classes_Lab.C2_Car_Constructors;

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
            Car car;
            if(p.length == 3){
                String model = p[0];
                String brand = p[1];
                int horse = Integer.parseInt(p[2]);
                car = new Car(model,brand,horse);
            }else if(p.length == 2){
                String model = p[0];
                String brand = p[1];
                car = new Car(model,brand);
            }else {
                String model = p[0];
                car = new Car(model);
            }out.add(car);
        }for(Car t : out){
            System.out.println(t.toString());
        }


    }
}
