package ATECHMODUL.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] %2 == 0){
                sum += a[i];
            }
        }
        System.out.println(sum);

    }
}
