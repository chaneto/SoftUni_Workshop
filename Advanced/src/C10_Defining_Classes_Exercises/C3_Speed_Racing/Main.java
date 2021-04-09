package C10_Defining_Classes_Exercises.C3_Speed_Racing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        Map<String,Car> output = new LinkedHashMap<>();
        for (int i = 0; i < size; i++) {
            String[] carinput = scanner.nextLine().split(" ");
            String carmodel = carinput[0];
            int fuel = Integer.parseInt(carinput[1]);
            double price = Double.parseDouble(carinput[2]);
            Car car = new Car(carmodel,fuel,price);
            output.put(carmodel,car);
        }while (true){
            String[] driveinput = scanner.nextLine().split(" ");
            if(driveinput[0].equals("End")){break;}
            String carmodel = driveinput[1];
            int km = Integer.parseInt(driveinput[2]);
            Drive drive = new Drive(carmodel,km);
            Car car = output.get(drive.getCar());
            double vr = drive.getKm() * car.getPrice();
            if(vr <= car.getFuel()){
                int sum = car.getKm() + drive.getKm();
                car.setKm(sum);
                double fuel = car.getFuel() - vr;
                car.setFuel(fuel);
            }else {
                System.out.println("Insufficient fuel for the drive");
            }
        }
        output.entrySet().stream()
                .forEach(f -> System.out.printf("%s %.2f %d%n",f.getKey(),f.getValue().getFuel(),f.getValue().getKm()));
    }
}
