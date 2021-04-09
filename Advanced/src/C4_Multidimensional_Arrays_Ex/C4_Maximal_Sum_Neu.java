package C4_Multidimensional_Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C4_Maximal_Sum_Neu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] a = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
        int row = a[0];
        int col = a[1];
        int max = Integer.MIN_VALUE;
        int[][] matrix = matruxfull (scanner,row,col);
        int[][] matrixmax = new int[3][3];
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int current = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] + matrix[i+1][j] + matrix[i+1][j+1] +
                        matrix[i+1][j+2] + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
                if(max < current){
                    max = current;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            matrixmax[k][l] = matrix[i+k][j+l];
                        }
                    }
                }
            }
        }
        System.out.println ("Sum = " + max);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print (matrixmax[i][j] + " ");
            }
            System.out.println ();
        }
    }

    public static int[][]matruxfull(Scanner scanner,int row, int col) {
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            int[] a = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
            for (int j = 0; j < a.length; j++) {
                matrix[i][j] = a[j];
            }
        }
        return matrix;
    }
}
