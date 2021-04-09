package C1_Abstraction.C2_Point_in_Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] input = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
        Rectangle rectangle = new Rectangle (input[0],input[1],input[2],input[3]);
        int size = Integer.parseInt (scanner.nextLine ());
        for (int i = 0; i < size; i++) {
            int[] a = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
            Point point = new Point (a[0], a[1]);
            System.out.println (rectangle.contains (point));
        }
    }
}
