package Vlojeni_Uslovni_Construkcii;

import java.util.Scanner;

public class CLASS9_Animal_Type {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        if (p.equals("dog")) {
            System.out.println("mammal");
        }else if (p.equals("crocodile") || p.equals("snake") || p.equals("tortoise")) {
            System.out.println("reptile");
        }else {
            System.out.println("unknown");
        }
    }
}
