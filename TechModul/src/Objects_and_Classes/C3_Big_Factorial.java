package ATECHMODUL.Objects_and_Classes;

import java.math.BigInteger;
import java.util.Scanner;

public class C3_Big_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        BigInteger out = new  BigInteger("1");
        for (int i = 2; i <= a; i++) {
            BigInteger vr = new BigInteger("" + i);
           out = out.multiply(vr);
        }
        System.out.println(out);
    }
}
