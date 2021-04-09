package ATECHMODUL.Objects_and_Classes_Ex.Cataloge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        List<Cataloge> in = new ArrayList<>();
        while (!p[0].equals("End")){
            String type = p[0];
            if(type.equals("car")){
                type = "Car";
            }else {
                type = "Truck";
            }
            String model = p[1];
            String color = p[2];
            double horse = Double.parseDouble(p[3]);
           Cataloge vr = new Cataloge(type,model,color, horse);
           in.add(vr);
            p = scanner.nextLine().split(" ");
        }
        while (true){
        String cmd = scanner.nextLine();
        if(cmd.equals("Close the Catalogue")){break;}
            in.stream()
                    .filter(f->f.getModel().equals(cmd))
                    .forEach(f-> System.out.println(f.toString()));

        }double carcount = 0;
        double truckcount = 0;
        double car = 0;
        double truck = 0;
        for (int i = 0; i < in.size(); i++) {
            Cataloge potok = in.get(i);
            if(potok.getType().equals("Car")){
                carcount++;
                car+=potok.getHorse();
            }else {
                truckcount++;
                truck+=potok.getHorse();
            }

        }if(carcount > 0){
        System.out.printf("Cars have average horsepower of: %.2f.%n",car / carcount);
        }else {
            System.out.printf("Cars have average horsepower of: 0.00.%n");
        }
        if(truckcount > 0){
        System.out.printf("Trucks have average horsepower of: %.2f.",truck / truckcount);
        }else {
            System.out.printf("Trucks have average horsepower of: 0.00.");
        }
    }
}
