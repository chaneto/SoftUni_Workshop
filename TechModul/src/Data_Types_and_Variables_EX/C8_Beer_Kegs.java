package ATECHMODUL.Data_Types_and_Variables_EX;

import java.util.Scanner;

public class C8_Beer_Kegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double bug = 0;
        String big = "";
        for (int i = 0; i < a ; i++) {
            String p = scanner.nextLine();
            double b = Double.parseDouble(scanner.nextLine());
            double c = Double.parseDouble(scanner.nextLine());
            sum = Math.PI * (b * b) * c;
        if(sum > bug){
            bug = sum;
            big = p;
        }
        }
        System.out.println(big);
    }
}
