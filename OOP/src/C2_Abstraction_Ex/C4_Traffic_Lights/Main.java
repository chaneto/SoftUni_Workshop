package C2_Abstraction_Ex.C4_Traffic_Lights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] input = scanner.nextLine ().split (" ");
        int size = Integer.parseInt (scanner.nextLine ());
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < input.length; j++) {
               int num = Lampe.valueOf (input[j]).getCardnummer ();
               num  = num + i + 1;
               if(num > 2){
                   num = num%3;
               }
                Lampe lampe = Lampe.values ()[num];
                System.out.print (Lampe.values ()[num] + " ");
            }
            System.out.println ();
        }
    }
}
