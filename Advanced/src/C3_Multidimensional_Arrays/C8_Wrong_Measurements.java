package C3_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C8_Wrong_Measurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[a][];
        int[][] matrixout = new int[a][];
        int lenght = 0;
        for (int i = 0; i < a; i++) {
            int[] in = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            lenght = in.length;
            matrix[i] = new int[lenght];
            matrixout[i] = new int[lenght];
            for (int j = 0; j < in.length; j++) {
                matrix[i][j] = in[j];
            }
        }
        int[] wrong = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int veler = matrix[wrong[0]] [wrong[1]];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < lenght; j++) {
                if(matrix[i][j] == veler){
                    int sum = 0;
                    if(i > 0 && matrix[i - 1][j] != veler){
                        sum += matrix[i - 1][j];
                    }if(i < a - 1 && matrix[i + 1][j] != veler){
                        sum += matrix[i + 1][j];
                    }if(j > 0 && matrix[i][j - 1] != veler){
                        sum +=  matrix[i][j - 1];
                    }if(j < lenght - 1 && matrix[i][j + 1] != veler){
                        sum += matrix[i][j + 1];
                    }matrixout[i][j] = sum;
                }
                else {
                    matrixout[i][j] = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < lenght; j++) {
                System.out.print(matrixout[i][j] + " ");
            }
            System.out.println();

        }
    }
}
