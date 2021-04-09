package EXAM;

import java.util.Scanner;

public class TASK16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budjet = Double.parseDouble(scanner.nextLine());
        double asciisum = 0;
        while (true)
        {
            String p = scanner.nextLine();
            if(p.equals("Stop"))
            {
                System.out.printf("Money left: %.0f",budjet);break;
            }
            for (int i = 0; i < p.length() ; i++)
            {
                asciisum += p.charAt(i);
            }
            if(budjet < asciisum)
            {
                System.out.printf("Not enough money!" );break;
            }
            if(budjet >= asciisum)
            {
                budjet -= asciisum;
                System.out.println("Item successfully purchased!");
                asciisum = 0;
            }

        }
    }
}
