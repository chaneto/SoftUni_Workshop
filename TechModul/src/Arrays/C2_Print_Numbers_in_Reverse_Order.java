package ATECHMODUL.Arrays;

import java.util.Scanner;

public class C2_Print_Numbers_in_Reverse_Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[a];
        for (int i = 0; i < arr.length ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            arr[i] = num;
            
        }
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
            
        }
    }
}
