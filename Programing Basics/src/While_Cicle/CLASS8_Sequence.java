package While_Cicle;

import java.util.Scanner;

public class CLASS8_Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double sum = 1;
        while (sum<=a) {
            System.out.printf("%.0f%n",sum);
            sum = (sum * 2) + 1;
            }
    }
}
