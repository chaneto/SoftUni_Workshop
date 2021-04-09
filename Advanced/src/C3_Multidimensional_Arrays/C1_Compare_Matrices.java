package C3_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C1_Compare_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean yes = true;
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = a[0];
        int col = a[1];
        int [][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            int[] rows = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < col; j++) {
                matrix[i][j] = rows[j];
            }
        }int[] a1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row1 = a1[0];
        int col1 = a1[1];
        int [][] matrix1 = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            int[] rows1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = rows1[j];
            }
        }
        if(matrix.length == matrix1.length){
            for (int i = 0; i < matrix.length; i++) {
                if(matrix[i].length == matrix1[i].length){
                    for (int j = 0; j < matrix[i].length; j++) {
                        if(matrix[i][j] != matrix1[i][j]){
                            yes = false;
                        }
                    }
                }else {
                    yes = false;
                }
            }
        }else {
            yes = false;
        }
        if(yes){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
