package C4_Encapsulation_Ex.C2_Animal_Farm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String p = scanner.nextLine ();
        int a = Integer.parseInt (scanner.nextLine ());
        try {
        Chicken chicken = new Chicken (p,a);
            System.out.println (chicken.toString ());
        }catch (IllegalArgumentException e){
            System.out.println (e.getMessage ());
        }
    }
}
