package ATECHMODUL.Data_Types_and_Variables_EX;

import java.util.Scanner;

public class C9_Spice_Must_Flow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = Integer.parseInt(scanner.nextLine());
        long days = 0;
        long sum = 0;
        long total = 0;
        if(a < 100){
            System.out.println(0);
            System.out.println(0);
        }if(a >= 100){
        while (true){
            sum = a - 26;
            if(a < 100){break;}
            days ++;
            total += sum;
            a -= 10;

        }
        System.out.println(days);
        System.out.println(total - 26);
        }
    }
}
