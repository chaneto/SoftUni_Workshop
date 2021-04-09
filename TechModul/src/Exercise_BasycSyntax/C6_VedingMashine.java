package ATECHMODUL.Exercise_BasycSyntax;

import java.util.Scanner;

public class C6_VedingMashine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = "";
        double sum = 0;
        while (true) {
            p = scanner.nextLine();
            if(p.equals("Start")){
                break;
            }
            double a = Double.parseDouble(p);
            if (a == 0.10 || a == 0.20 || a == 0.50 || a == 1 || a == 2) {
                sum += a;
            } else {
                System.out.printf("Cannot accept %.2f%n", a);
            }

        }while (true){
            p = scanner.nextLine();
            if(p.equals("End")){break;}
            if(p.equals("Nuts")){
                if(sum >= 2){
                    sum -= 2;
                    System.out.println("Purchased Nuts");
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }if(p.equals("Water")){
                if(sum >= 0.70){
                    sum -= 0.70;
                    System.out.println("Purchased Water");
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }if(p.equals("Crisps")){
                if(sum >= 1.5){
                    sum -= 1.5;
                    System.out.println("Purchased Crisps");
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }if(p.equals("Soda")){
                if(sum >= 0.80){
                    sum -= 0.80;
                    System.out.println("Purchased Soda");
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }if(p.equals("Coke")){
                if(sum >= 1){
                    sum -= 1;

                    System.out.println("Purchased Coke");
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }if(!((p.equals("Nuts") || p.equals("Water") || p.equals("Crisps")
                    || p.equals("Soda") || p.equals("Coke")))){
                System.out.println("Invalid product");
            }
        }
        System.out.printf("Change: %.2f",sum);
    }
}