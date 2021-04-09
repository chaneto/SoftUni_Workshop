package ATECHMODUL.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C6_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < a.length ; i++) {
            counter++;
            if(a[i] != b[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",counter - 1);return;
            }else{
                sum += a[i];

            }

        }System.out.printf("Arrays are identical. Sum: %d",sum );
    }
}
