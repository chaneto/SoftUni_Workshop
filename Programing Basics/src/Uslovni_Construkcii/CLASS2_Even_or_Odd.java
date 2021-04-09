package Uslovni_Construkcii;

import java.util.Scanner;

public class CLASS2_Even_or_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        if(a%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

}
