package EXAM3;

import java.util.Scanner;

public class C6_Wedding_Seats_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sector = scanner.nextLine().charAt(0);
        int red = Integer.parseInt(scanner.nextLine());
        int mqsto = Integer.parseInt(scanner.nextLine());
        mqsto += 97;
        int t = mqsto;
        int counter = 0;
        for (char i = 'A'; i <= sector; i++) {
            if(i != 'A'){red++;}
            for (int j = 1; j <= red; j++) {
                if (j % 2 == 0) {
                    t = mqsto + 2;}
                if(j % 2 != 0){
                    t = mqsto;
                }
                for (int k = 97; k < t; k++) {
                    counter++;

                    System.out.printf("%s%d%s%n", i, j,(char)k);


                }

            }

        }
        System.out.println(counter);
    }
}
