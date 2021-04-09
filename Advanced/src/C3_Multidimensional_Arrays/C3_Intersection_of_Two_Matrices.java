package C3_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C3_Intersection_of_Two_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rol = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String [rol][col];
        String [][] matrix1 = new String [rol][col];
        String [][] out = new String [rol][col];
        for (int i = 0; i < rol; i++) {
            String[] in = scanner.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = in[j];
            }
        }for (int i = 0; i < rol; i++) {
            String[] in = scanner.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = in[j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j].equals(matrix1[i][j])){
                    out[i][j] = matrix[i][j];
                }else {
                    out[i][j] = "*";
                }
            }
        }
        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[i].length; j++) {
                System.out.print(out[i][j] + " ");
            }
            System.out.println();
        }

    }
}
