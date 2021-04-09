package ATECHMODUL.Exercise_BasycSyntax;

import java.util.Scanner;

public class C2_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double total = 0;
        if(day.equals("Friday")){
            if(group.equals("Students")){
                total = a * 8.45;
            }else if(group.equals("Business")){
                total = a * 10.90;
            }else if(group.equals("Regular")){
                total = a * 15;
            }
        }if(day.equals("Saturday")){
            if(group.equals("Students")){
                total = a * 9.80;
            }else if(group.equals("Business")){
                total = a * 15.60;
            }else if(group.equals("Regular")){
                total = a * 20;
            }
        }if(day.equals("Sunday")){
            if(group.equals("Students")){
                total = a * 10.46;
            }else if(group.equals("Business")){
                total = a * 16;
            }else if(group.equals("Regular")){
                total = a * 22.50;
            }
        }if(group.equals("Students") && a >= 30){
            total = total - total * 0.15;
        }if(group.equals("Business") && a >= 100){
            total = total / a;
            total = total * (a - 10);
        }if(group.equals("Regular") && a >= 10 && a <= 20){
            total = total - total * 0.05;
        }
        System.out.printf("Total price: %.2f",total);
    }
}
