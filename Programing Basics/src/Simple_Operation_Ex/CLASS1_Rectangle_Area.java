package Simple_Operation_Ex;

import java.util.Scanner;

public class CLASS1_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a1 = Double.parseDouble(scanner.nextLine());
        double b1 = Double.parseDouble(scanner.nextLine());
        double a2 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double x = Math.abs(a1-a2);
        double y = Math.abs(b1-b2);
        double area = x*y;
        double p = 2*(x+y);
        System.out.println(area);
        System.out.println(p);

    }
}
