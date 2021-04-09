package Uslovni_Construkcii;

import java.util.Scanner;

public class CLASS9_Equals_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        if(a == b && b == c && a == c){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
