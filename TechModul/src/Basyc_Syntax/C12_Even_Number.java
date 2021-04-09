package ATECHMODUL.Basyc_Syntax;

import java.util.Scanner;

public class C12_Even_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int a = Integer.parseInt(scanner.nextLine());
            if(a % 2 == 0){
                System.out.printf("The number is: %d",Math.abs(a));break;
            }else{
                System.out.println("Please write an even number." );
            }


        }
    }
}
