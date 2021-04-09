package ATECHMODUL.Data_Types_and_Variables_EX;

import java.util.Scanner;

public class C4_Sum_of_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < a ; i++) {
            char p  = scanner.nextLine().charAt(0);
            sum += p;


        }
        System.out.printf("The sum equals: %d", sum);
    }
}
