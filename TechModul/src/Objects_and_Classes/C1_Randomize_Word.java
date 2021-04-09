package ATECHMODUL.Objects_and_Classes;

import java.util.Random;
import java.util.Scanner;

public class C1_Randomize_Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        Random rnd = new Random();
        for (int i = 0; i < p.length; i++) {
            int a = rnd.nextInt(p.length);
            String b = p[i];
            p[i] = p[a];
            p[a] = b;
        }
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }
}
