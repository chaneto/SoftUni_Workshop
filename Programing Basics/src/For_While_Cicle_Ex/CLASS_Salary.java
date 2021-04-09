package For_While_Cicle_Ex;

import java.util.Scanner;

public class CLASS_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double p = 0;
        double p1 = 0;
        double p2 = 0;
        double total = 0;
        for (int i = 0; i < a; i++) {
            String brouser = scanner.nextLine();
            if (brouser.equals("Facebook")) {
                b -= 150;
            }
           else if (brouser.equals("Instagram")) {
                b -= 100;
            }
           else if (brouser.equals("Reddit")) {
                b -= 50;

            }
            if (b <= 0) {
                    System.out.println("You have lost your salary.");
                    break;
                }


        }if(b>0) {System.out.printf("%.0f", b);}

    }
}