package ATECHMODUL.Methods;

import java.util.Scanner;

public class C5_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        Orders(p,a);

    }public static void Orders(String p , int a){
        if(p.equals("coffee")){
            System.out.printf("%.2f",a * 1.50);
        }if(p.equals("water")){
            System.out.printf("%.2f",a * 1.00);
        }if(p.equals("coke")){
            System.out.printf("%.2f",a * 1.40);
        }if(p.equals("snacks")){
            System.out.printf("%.2f",a * 2.00);
        }
    }
}
