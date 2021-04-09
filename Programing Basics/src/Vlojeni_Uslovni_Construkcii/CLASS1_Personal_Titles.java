package Vlojeni_Uslovni_Construkcii;

import java.util.Scanner;

public class CLASS1_Personal_Titles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        char a = scanner.nextLine().charAt(0);
        if (a == 'f') {
            if (age >=16) {
                System.out.println("Ms.");
            }else {
                System.out.println("Miss");
            }
        }if (a == 'm') {
            if (age >= 16) {
                System.out.println("Mr.");
            }else {
                System.out.println("Master");
            }
        }
        }
        }
