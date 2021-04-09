package Uslovni_Construkcii;

import java.util.Scanner;

public class CLASS8_Area_off_Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String f = scanner.nextLine();
        if(f.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",a*a);
        }else if(f.equals("circle")){
            double a = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",Math.PI*a*a);
        }else if(f.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",a*b);
        }else if(f.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",(a*b)/2);
        }

    }
}
