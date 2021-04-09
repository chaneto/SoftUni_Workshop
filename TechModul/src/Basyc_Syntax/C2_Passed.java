package ATECHMODUL.Basyc_Syntax;

import java.util.Scanner;

public class C2_Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        if(a >= 3){
            System.out.println("Passed!");
        }
    }
}
