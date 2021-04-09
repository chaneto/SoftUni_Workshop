package ATECHMODUL.Data_Types_and_Variables;

import java.util.Scanner;

public class C9_Centuries_to_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());
        int years = centuries * 100;
        int days = (int)(years * 365.2422);
        int  hours = days * 24;
        int min = hours * 60;
        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",centuries,years,days,hours,min);




    }
}
