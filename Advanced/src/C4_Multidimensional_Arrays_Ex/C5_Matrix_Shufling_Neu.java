package C4_Multidimensional_Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C5_Matrix_Shufling_Neu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] a = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
        int rows = a[0];
        int cols = a[1];
        String[][] matrix = matrixfull (scanner,rows,cols);
        while (true){
            String[] p = scanner.nextLine ().split (" ");
            if(p[0].equals ("END")){
                break;
            }if(p[0].equals ("swap") && p.length == 5){
                int row = Integer.parseInt (p[1]);
                int col = Integer.parseInt (p[2]);
                int row1 = Integer.parseInt (p[3]);
                int col1 = Integer.parseInt (p[4]);
                if(row >= 0 && row < rows && col >= 0 && col < cols && row1 >= 0 && row1 < rows && col1 >= 0 && col1 < cols){
                    String wr = matrix[row][col];
                    matrix[row][col] = matrix[row1][col1];
                    matrix[row1][col1] = wr;
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print (matrix[i][j] + " ");
                        }
                        System.out.println ();
                    }
                }else {
                    System.out.println ("Invalid input!");
                }
            }else {
                System.out.println ("Invalid input!");
            }
        }

    }public static String[][] matrixfull(Scanner scanner, int rows, int cols){
        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] input = scanner.nextLine ().split (" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input[j];
            }
        }return matrix;
    }
}
