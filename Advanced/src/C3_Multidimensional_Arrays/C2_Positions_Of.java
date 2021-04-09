package C3_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C2_Positions_Of {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean yes = true;
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rol = a[0];
        int col = a[1];
        int [][] matrix = new int [rol][col];
        for (int i = 0; i < rol; i++) {
            int[] in = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < col; j++) {
                matrix[i][j] = in[j];
            }
        }
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == num){
                    System.out.printf("%d %d%n",i,j);
                    yes = false;
                }
            }
        }if(yes){
            System.out.println("not found");
        }
    }
}
