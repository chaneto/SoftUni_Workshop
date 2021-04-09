package Vlojeni_Uslovni_Construkcii;

import java.util.Scanner;

public class CLASS2_Small_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        String g = scanner.nextLine();
        double broi = Double.parseDouble(scanner.nextLine());
        if (g.equals("Sofia")) {
            if (p.equals("coffee")) {
                System.out.println(broi * 0.5);
            }else if (p.equals("water")) {
                System.out.println(broi * 0.8);
            }else if (p.equals("beer")) {
                System.out.println(broi * 1.2);
            }else if (p.equals("sweets")) {
                System.out.println(broi * 1.45);
            }else if (p.equals("peanuts")) {
                System.out.println(broi * 1.6);
            }
        }else if (g.equals("Plovdiv")) {
            if (p.equals("coffee")) {
                System.out.println(broi * 0.4);
            }else if (p.equals("water")) {
                System.out.println(broi * 0.7);
            }else if (p.equals("beer")) {
                System.out.println(broi * 1.15);
            }else if (p.equals("sweets")) {
                System.out.println(broi * 1.3);
            }else if (p.equals("peanuts")) {
                System.out.println(broi * 1.5);
            }
        }else if (g.equals("Varna")) {
            if (p.equals("coffee")) {
                System.out.println(broi * 0.45);
            }else if (p.equals("water")) {
                System.out.println(broi * 0.7);
            }else if (p.equals("beer")) {
                System.out.println(broi * 1.1);
            }else if (p.equals("sweets")) {
                System.out.println(broi * 1.35);
            }else if (p.equals("peanuts")) {
                System.out.println(broi * 1.55);
            }
        }
    }
}
