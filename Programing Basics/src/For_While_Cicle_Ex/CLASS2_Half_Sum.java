package For_While_Cicle_Ex;

import java.util.Scanner;

public class CLASS2_Half_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broi = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < broi; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            if (a > max){
                max = a;}
                sum = (sum + a );

        }sum = sum - max;
        if (sum == max) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(max - sum));
        }
    }
}
