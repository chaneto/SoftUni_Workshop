package C3_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C6_Print_Diagonals_of_Square_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt (scanner.nextLine ());
        int[][] matrix = matrixfull (scanner,a);
        int count = 0;
        while (count < a ){
            System.out.print (matrix[count][count] + " ");
            count++;
        }
        System.out.println ();
        int count1 = a;
        count = 0;
        while (count < a){
            count1--;
            System.out.print (matrix[count1][count] + " ");
            count++;

        }


    }public static int[][] matrixfull(Scanner scanner,int a){
        int[][] matrix = new int[a][a];
        for (int i = 0; i < a; i++) {
            int[] in = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
            for (int j = 0; j < in.length; j++) {
                matrix[i][j] = in[j];
            }
        }return matrix;
    }
}
