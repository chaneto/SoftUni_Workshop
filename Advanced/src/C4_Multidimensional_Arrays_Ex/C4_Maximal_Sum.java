package C4_Multidimensional_Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C4_Maximal_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int red = a[0];
        int col = a[1];
        int[][] matrix = new int[red][col];
        for (int i = 0; i < red; i++) {
            int[] in = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < col; j++) {
                matrix[i][j] = in[j];
            }
        }int sum = 0;
        int win = 0;
        int red1 = 0;
        int col1 = 0;
        int[][] out = new int[3][3];
        int[][] out1 = new int[3][3];
        while (red1 + 3 <= red ){
            int index = 0;
            for (int i = red1; i < red1 +  3; i++) {
                int index1 = 0;
                for (int j = col1; j < col1 + 3; j++) {
                    sum += matrix[i][j];
                    out[index][index1] = matrix[i][j];
                    index1++;
                }index++;
            }if(sum > win){
                out1 = out;
                win = sum;
            }sum = 0;
            out = new int[3][3];
            col1++;
            if(col1 + 3 > col){
                red1++;
                col1 = 0;
            }
        }
        System.out.println("Sum = " + win);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(out1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
