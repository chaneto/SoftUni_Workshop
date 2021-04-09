package While_Cicle;

import java.util.Scanner;

public class CLASS1_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in the range [1...10] ");
        int a = Integer.parseInt(scanner.nextLine());

        while(a < 1 || a > 100) {
            System.out.println("Invalid number!");
            System.out.print("Enter a number in the range [1...10] ");
            a = Integer.parseInt(scanner.nextLine());
        } System.out.println("The number is: " + a);
    }
}
