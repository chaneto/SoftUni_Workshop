package C2_Abstraction_Ex.C_5Jedi_Galaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int[] matrixsize = Arrays
                .stream (scanner.nextLine ()
                        .split (" "))
                .mapToInt (Integer::parseInt)
                .toArray ();
        int row = matrixsize[0];
        int col = matrixsize[1];
        int[][] matrix = new int[row][col];
        matrixFull (row, col, matrix);
        String command = scanner.nextLine ();
        long sum = 0;
        while (!command.equals ("Let the Force be with you")) {
            int[] Pesho = Arrays.stream (command.split (" ")).mapToInt (Integer::parseInt).toArray ();
            int[] evil = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
            evilRoad (matrix, evil);

            sum = getSum (matrix, sum, Pesho);

            command = scanner.nextLine ();
        }

        System.out.println (sum);


    }

    private static long getSum(int[][] matrix, long sum, int[] pesho) {
        int rowPesho = pesho[0];
        int colPesho = pesho[1];

        while (rowPesho >= 0 && colPesho < matrix[1].length) {
            if (rowPesho < matrix.length && colPesho >= 0) {
                sum += matrix[rowPesho][colPesho];
            }

            colPesho++;
            rowPesho--;
        }
        return sum;
    }

    private static void evilRoad(int[][] matrix, int[] evil) {
        int rowEvil = evil[0];
        int colEvil = evil[1];

        while (rowEvil >= 0 && colEvil >= 0) {
            if (rowEvil < matrix.length && colEvil < matrix[0].length) {
                matrix[rowEvil][colEvil] = 0;
            }
            rowEvil--;
            colEvil--;
        }
    }

    private static void matrixFull(int row, int col, int[][] matrix) {
        int value = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = value++;
            }
        }
    }
}
