package Vlojeni_Uslovni_Construkcii;

import java.util.Scanner;

public class CLASS9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        switch (p) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
                System.out.println("reptile");
                break;
            case "snake":
                System.out.println("reptile");
                break;
            case "tortoise":
                System.out.println("reptile");
                break;
            default: {
                System.out.println("unknown");
            }
        }
    }
}
