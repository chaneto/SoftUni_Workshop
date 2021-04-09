package ATECHMODUL.Data_Types_and_Variables_EX;

import java.util.Scanner;

public class C7_Water {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        int sum = 0;
        while (a >= counter){
            int b = Integer.parseInt(scanner.nextLine());
            counter++;
            if(sum <= 255){
            sum += b;}
            if(sum > 255){
                sum -= b;
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sum);
    }
}
