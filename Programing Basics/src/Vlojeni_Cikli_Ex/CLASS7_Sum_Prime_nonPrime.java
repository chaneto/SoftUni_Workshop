package Vlojeni_Cikli_Ex;

import java.util.Scanner;

public class CLASS7_Sum_Prime_nonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prosto = 0;
        int neprosto = 0;
        String p = scanner.nextLine();
        while (!(p.equals("stop"))){
            int num = Integer.parseInt(p);
            if(num < 0){
                System.out.println("Number is negative.");
                p = scanner.nextLine();
                continue;
            }
            boolean eprosto = true;
            if(num == 1){
                eprosto = false;
            }
            int temp;
            for (int i = 2; i <= num / 2 ; i++) {
                temp = num % i;
                if(temp  == 0){
                    eprosto = false;break;
                }

            }if(eprosto){
                prosto += num;
            }else{
                neprosto += num;
            }p = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",prosto);
        System.out.printf("Sum of all non prime numbers is: %d",neprosto);

    }
}