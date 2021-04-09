package ATECHMODUL.Data_Types_and_Variables_EX;

import java.util.Scanner;

public class C2_Sum_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = 0;
        int sum = 0;
        while (a > 0){
            b = a % 10;
            sum += b;
            a = a / 10;
        }
        System.out.println(sum);
    }
}
