package C4_Multidimensional_Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C3_Diagonal_Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt (scanner.nextLine ());
        int[][] matrix = new int[a][a];
        for (int i = 0; i < a; i++) {
            int[] in = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
            for (int j = 0; j < a; j++) {
                matrix[i][j] = in[j];
            }
        }
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < a; i++) {
            sum += matrix[i][i];
        }
        int col = a;
        for (int i = 0; i < a; i++) {
            col--;
            sum1 += matrix[i][col];
        }
        System.out.println (Math.abs (sum - sum1));
    }
}
