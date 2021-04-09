package ATECHMODUL.Arrays;

import java.util.Scanner;

public class C3_Sum_Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        int sum = 0;
        for (int i = 0; i < a.length ; i++) {
          int num = Integer.parseInt(a[i]);
            if(num %2 == 0) {
                sum += num;
            }
            
        }
        System.out.println(sum);

    }
}
