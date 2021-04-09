package C4_Multidimensional_Arrays_Ex;

import java.util.Scanner;

public class C1_Fill_the_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] p = scanner.nextLine ().split (", ");
        int size = Integer.parseInt (p[0]);
        String pattern = p[1];
        int count = 0;
        int[][] matrix = new int[size][size];
        if(pattern.equals ("A")){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    count++;
                    matrix[j][i] = count;
                }
            }
        }if(pattern.equals ("B")){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    count++;
                    matrix[j][i] = count;
                }i++;
                if(i >= size){break;}
                for (int j = size - 1; j >= 0 ; j--) {
                    count++;
                    matrix[j][i] = count;
                    System.out.println ();
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int s = 0; s < size; s++) {
                System.out.print (matrix[i][s] + " ");
            }
            System.out.println ();
        }
    }
}
