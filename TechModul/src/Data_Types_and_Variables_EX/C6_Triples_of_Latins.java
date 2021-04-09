package ATECHMODUL.Data_Types_and_Variables_EX;

import java.util.Scanner;

public class C6_Triples_of_Latins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                for (int k = 0; k < a; k++) {


                    System.out.printf("%c%c%c%n",(char)i + 97,(char)j +97,(char)k+97);

                }

            }

        }
    }
}
