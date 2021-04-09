package ATECHMODUL.Data_Types_and_Variables_More;

import java.util.Scanner;

public class C3_Floating_Equality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = 0;
        if(a > b){
            c = a - b;
        }else {
            c = b - a;
        }if(c < 0.000001){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
