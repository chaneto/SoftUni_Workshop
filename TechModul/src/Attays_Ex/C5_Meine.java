package ATECHMODUL.Attays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C5_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i <  a.length; i++) {
            boolean b = true;
            for (int j = i + 1; j < a.length ; j++) {
                if(a[i] <= a[j]){
                    b = false;
                }

            }if(b){
                System.out.print(a[i] + " ");
            }

        }
    }
}
