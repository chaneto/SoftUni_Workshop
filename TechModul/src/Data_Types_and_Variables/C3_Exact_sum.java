package ATECHMODUL.Data_Types_and_Variables;

import java.math.BigDecimal;
import java.util.Scanner;

public class C3_Exact_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double counter = 1;
        BigDecimal total = BigDecimal.ZERO;
        while (a >= counter){
            BigDecimal b = new BigDecimal(scanner.nextLine());
        counter++;
        total = total.add(b);

        }
        System.out.println(total);
    }
}
