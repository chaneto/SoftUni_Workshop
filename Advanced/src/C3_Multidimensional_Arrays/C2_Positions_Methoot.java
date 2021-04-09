package C3_Multidimensional_Arrays;

import java.util.Scanner;

public class C2_Positions_Methoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int row = Integer.parseInt (scanner.nextLine ());
        int col = Integer.parseInt (scanner.nextLine ());
        String[][] matrix = readmatrix (scanner, row, col);
        String[][] matrix1 = readmatrix (scanner, row, col);

        String[][] out = new String[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals (matrix1[i][j])) {

                    out[i][j] = matrix[i][j];
                } else {
                    out[i][j] = "*";
                }
            }
        }
        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[i].length; j++) {
                System.out.print (out[i][j] + " ");
            }
            System.out.println ();
        }
    }

    public static String[][] readmatrix(Scanner scanner, int row, int col) {
        String[][] matrix = new String[row][col];
        for (int i = 0; i < row; i++) {
            String[] p = scanner.nextLine ().split (" ");
            for (int j = 0; j < p.length; j++) {
                matrix[i][j] = p[j];
            }
        }
        return matrix;
    }
}
