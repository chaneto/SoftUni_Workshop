package Vlojeni_Uslovni_Construkcii;

import java.util.Scanner;

public class CLASS5_Invalid_Numer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        if(!(a>=100 && a<=200 || a==0)) {
            System.out.println("invalid");

        }
    }
}
