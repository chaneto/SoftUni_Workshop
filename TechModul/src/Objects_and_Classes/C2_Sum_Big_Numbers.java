package ATECHMODUL.Objects_and_Classes;

import java.math.BigInteger;
import java.util.Scanner;

public class C2_Sum_Big_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger in = new BigInteger(scanner.nextLine());
        BigInteger in1 = new BigInteger(scanner.nextLine());
        System.out.println(in.add(in1));
    }
}
