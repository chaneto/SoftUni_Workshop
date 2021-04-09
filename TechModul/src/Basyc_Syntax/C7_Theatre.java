package ATECHMODUL.Basyc_Syntax;

import java.util.Scanner;

public class C7_Theatre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        if(p.equals("Weekday")){
            if(a >= 0 && a <= 18){
                sum = 12;
            }else if(a > 18 && a <= 64){
                sum = 18;
            }else if(a > 64 && a <= 122){
                sum = 12;
            }
        }else if(p.equals("Weekend")){
            if(a >= 0 && a <= 18){
                sum = 15;
            }else if(a > 18 && a <= 64){
                sum = 20;
            }else if(a > 64 && a <= 122){
                sum = 15;
            }
        }else if(p.equals("Holiday")){
            if(a >= 0 && a <= 18){
                sum = 5;
            }else if(a > 18 && a <= 64){
                sum = 12;
            }else if(a > 64 && a <= 122){
                sum = 10;
            }
        }if(a < 0 || a > 122){
            System.out.println("Error!");
        }else {
            System.out.println(sum + "$");
        }
    }
}
