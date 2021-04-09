package Vlojeni_Uslovni_Construkci;

import java.util.Scanner;

public class CLASS9_Operation_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        String p = scanner.nextLine();
        double sum = 0;
        if(p.equals("+")){
            sum = a + b;
            if(sum % 2 == 0){
                System.out.printf("%.0f + %.0f = %.0f - even",a,b,sum);
            }else{
                System.out.printf("%.0f + %.0f = %.0f - odd",a,b,sum);
            }
        } if(p.equals("-")){
            sum = a - b;
            if(sum % 2 == 0){
                System.out.printf("%.0f - %.0f = %.0f - even",a,b,sum);
            }else{
                System.out.printf("%.0f - %.0f = %.0f - odd",a,b,sum);
            }
        } if(p.equals("*")){
            sum = a * b;
            if(sum % 2 == 0){
                System.out.printf("%.0f * %.0f = %.0f - even",a,b,sum);
            }else{
                System.out.printf("%.0f * %.0f = %.0f - odd",a,b,sum);
            }
        } if(p.equals("/")){
            sum = a / b;
            if(b == 0) {
                System.out.printf("Cannot divide %.0f by zero", a);
            }else{
                System.out.printf("%.0f / %.0f = %.2f",a,b,sum);
            }
        } if(p.equals("%")){
            sum = a % b;
            if(b == 0) {
                System.out.printf("Cannot divide %.0f by zero", a);
            }else{
                System.out.printf("%.0f %% %.0f = %.0f",a,b,sum);
            }
        }
    }

}
