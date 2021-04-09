package ATECHMODUL.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C7_Condense_Array_to_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        int total = 0;
        while (a.length > 1){
            int[] b = new int[a.length - 1];
            for (int i = 0; i < b.length; i++) {
                b[i] = a[i] + a[i + 1];
            }a=b;
        }
        System.out.println(a[0]);

    }
}
