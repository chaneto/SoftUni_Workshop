package C3_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C4_Sum_Matrix_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] a = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[a[0]][a[1]];
        for (int i = 0; i < a[0]; i++) {
            int[] in = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < a[1]; j++) {
                matrix[i][j] = in[j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(sum);

    }
}
