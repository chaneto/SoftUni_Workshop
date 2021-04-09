package Data_Types_and_Variables_EX;

import java.util.Scanner;

public class C1_Integer_Operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int sum = (a + b) / c * d;
        System.out.println(sum);
    }
}
