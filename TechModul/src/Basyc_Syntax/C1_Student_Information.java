package ATECHMODUL.Basyc_Syntax;

import java.util.Scanner;

public class C1_Student_Information {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f",p,a,b);

    }
}
