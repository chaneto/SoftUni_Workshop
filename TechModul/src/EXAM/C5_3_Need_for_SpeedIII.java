package ATECHMODUL.EXAM;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C5_3_Need_for_SpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> km = new TreeMap<>();
        Map<String,Integer> fuel = new TreeMap<>();
        for (int i = 0; i < a; i++) {
            String[] p = scanner.nextLine().split("\\|");
            String auto = p[0];
            int probeg = Integer.parseInt(p[1]);
            int gorivo = Integer.parseInt(p[2]);
            if(!km.containsKey(auto)){
                km.put(auto,probeg);
                fuel.put(auto,gorivo);
            }
        }while (true){
            String[] p = scanner.nextLine().split(" : ");
            String cmd = p[0];
            if(cmd.equals("Stop")){break;}
            if(cmd.equals("Drive")){
                String auto = p[1];
                int probeg = Integer.parseInt(p[2]);
                int gorivo = Integer.parseInt(p[3]);
                if(fuel.get(auto) >= gorivo){
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",auto,probeg,gorivo);
                    gorivo = fuel.get(auto) - gorivo;
                    probeg = km.get(auto) + probeg;
                    if(probeg >= 100000){
                        System.out.printf("Time to sell the %s!%n",auto);
                        km.remove(auto);
                        fuel.remove(auto);
                    }else {
                        km.put(auto,probeg);
                        fuel.put(auto,gorivo);
                    }
                }else {
                    System.out.printf("Not enough fuel to make that ride%n");
                }
            }if(cmd.equals("Refuel")){
                String auto = p[1];
                int gorivo = Integer.parseInt(p[2]);
                int result = gorivo;
                gorivo = gorivo + fuel.get(auto);
                if(gorivo > 75){
                    gorivo = 75;
                    result = 75 - fuel.get(auto);
                }fuel.put(auto,gorivo);
                System.out.printf("%s refueled with %d liters%n",auto,result);
            }if(cmd.equals("Revert")){
                String auto = p[1];
                int probeg = Integer.parseInt(p[2]);
                int result = km.get(auto) - probeg;
                if(result < 10000){
                    result = 10000;
                    km.put(auto,result);
                }else {
                    System.out.printf("%s mileage decreased by %d kilometers%n",auto,probeg);
                    km.put(auto,result);
                }
            }
        }km.entrySet()
                .stream()
                .sorted((s1,s2) -> s2.getValue().compareTo(s1.getValue()))
                .forEach(f -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",f.getKey(),f.getValue(),fuel.get(f.getKey())));
    }
}
