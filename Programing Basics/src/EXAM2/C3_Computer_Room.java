package EXAM2;

import java.util.Scanner;

public class C3_Computer_Room {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monat = scanner.nextLine();
        double hour = Double.parseDouble(scanner.nextLine());
        double people = Double.parseDouble(scanner.nextLine());
        String tag = scanner.nextLine();
        double price = 0;
        double total = 0;
        if ((monat.equals("march") || monat.equals("april")|| monat.equals("may")) && tag.equals("day")){
            price = 10.50;
        }else if ((monat.equals("march") || monat.equals("april")|| monat.equals("may") )&& tag.equals("night")){
            price = 8.40;
        }else if((monat.equals("june") || monat.equals("july") || monat.equals("august") )&& tag.equals("day")){
            price = 12.60;
        }else if((monat.equals("june") || monat.equals("july") || monat.equals("august") )&& tag.equals("night")){
            price = 10.20;
        }if(people >= 4 ){
            price -= price * 0.10;
        }if(hour >= 5){
            price -= price * 0.50;
        }total = people * hour * price;
        System.out.printf("Price per person for one hour: %.2f%n",price);
        System.out.printf( "Total cost of the visit: %.2f",total);


    }
}
