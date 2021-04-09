package Uslovni_Construkcii;

import java.util.Scanner;

public class CLASS3_Greater_Numer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
