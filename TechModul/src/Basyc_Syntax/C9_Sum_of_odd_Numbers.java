package ATECHMODUL.Basyc_Syntax;

import java.util.Scanner;

public class C9_Sum_of_odd_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;
        for (int i = 1 ; i <= 1000000000 ; i+=2 ) {
            counter++;
            sum+=i;
            System.out.println(i);
            if(counter == a){break;}


            }
        System.out.printf("Sum: %d",sum);


    }
}
