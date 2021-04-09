package EXAM;

import java.util.Scanner;

public class TASK14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        int counter16 = 0;
        int counterover16 = 0;
        int sumgift = 0;
        int sump = 0;
        while (!(p.equals("Christmas")))
        {
            int a = Integer.parseInt(p);

            if(a <= 16)
            {
                counter16++;
            }
            if(a > 16)
            {
                counterover16++;
            }

            p = scanner.nextLine();
        }
        sumgift = counter16 * 5;
        sump = counterover16 * 15;
        System.out.printf("Number of adults: %d%n",counterover16 );
        System.out.printf("Number of kids: %d%n",counter16);
        System.out.printf("Money for toys: %d%n",sumgift);
        System.out.printf("Money for sweaters: %d",sump);
    }
}
