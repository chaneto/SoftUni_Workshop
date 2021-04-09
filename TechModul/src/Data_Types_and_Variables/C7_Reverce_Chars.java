package ATECHMODUL.Data_Types_and_Variables;

import java.util.Scanner;


public class C7_Reverce_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);
        System.out.printf("%s %s %s",c,b,a);

    }
}
