package Vlojeni_Uslovni_Construkcii;

import java.util.Scanner;

public class CLASS4_Fruit_or_Vegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        if (p.equals("banana") || p.equals("apple") || p.equals("kiwi") || p.equals("cherry") || p.equals("lemon") || p.equals("grapes")  ) {
            System.out.println("fruit");
        }else if (p.equals("tomato") || p.equals("cucumber") || p.equals("pepper")|| p.equals("carrot")) {
            System.out.println("vegetable");
        }else {
            System.out.println("unknown");
        }


    }
}
