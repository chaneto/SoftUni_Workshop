package C3_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C5_Maximum_Sum_of_2x2_Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream (scanner.nextLine ().split (", ")).mapToInt (Integer::parseInt).toArray ();
        int row = a[0];
        int col = a[1];
        int max = Integer.MIN_VALUE;
        int[][] matrix = matruxfull (scanner,row,col);
        int[][] matrixmax = new int[2][2];
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int current = matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1];
                if(max < current){
                    max = current;
                    matrixmax[0][0] = matrix[i][j];
                    matrixmax[0][1] = matrix[i][j+1];
                    matrixmax[1][0] = matrix[i+1][j];
                    matrixmax[1][1] = matrix[i+1][j+1];

                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print (matrixmax[i][j] + " ");
            }
            System.out.println ();
        }
        System.out.println (max);

    }

    public static int[][]matruxfull(Scanner scanner,int row, int col) {
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            int[] a = Arrays.stream (scanner.nextLine ().split (", ")).mapToInt (Integer::parseInt).toArray ();
            for (int j = 0; j < a.length; j++) {
                matrix[i][j] = a[j];
            }
        }
        return matrix;
    }
}
