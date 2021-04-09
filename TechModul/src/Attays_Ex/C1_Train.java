package ATECHMODUL.Attays_Ex;

import java.util.Scanner;

public class C1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[a];
        int sum = 0;
        for (int i = 0; i < a ; i++) {
            int b = Integer.parseInt(scanner.nextLine());
            arr[i] = b;

        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.printf("%d ",arr[i]);
            sum += arr[i];
        }
        System.out.printf("%n%d",sum);
    }
}
