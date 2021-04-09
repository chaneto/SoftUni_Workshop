package Uslovni_Konstrukcii_Ex;

import java.util.Scanner;

public class CLASS2_Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        double b = 0;
        if(a % 10 == 5){
            if(a<=100)b=5+2;
            else if(a>100&&a<=1000)b=a*0.20+2;
            else if(a>1000)b=a*0.10+2;}
        else if(a%2==0){
            if(a<=100)b=5+1;
            else if(a>100&&a<=1000)b=a*0.20+1;
            else if(a>1000)b=a*0.10+1;}
        else if(a<=100)b=5;
         else if(a>100&&a<=1000)b=a*0.20;
         else if(a>1000)b=a*0.10;

        System.out.println(b);
        System.out.println(a+b);
    }



        }





