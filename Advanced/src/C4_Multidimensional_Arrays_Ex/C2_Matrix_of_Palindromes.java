package C4_Multidimensional_Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C2_Matrix_of_Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int red = a[0];
        int col = a[1];
        String in = "";
        String[][] out = new String[red][col];
        char chr = 'a';
        for (int i = 0; i < red; i++) {
            char mitel = chr;
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < 3; k++) {
                    if(k == 1 && j > 0){
                        mitel ++;
                        in += mitel;
                    }else {
                    in += chr;
                    }

                }out[i][j] = in;
                in = "";
            }chr++;
        }
        for (int i = 0; i < red; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(out[i][j] + " ");
            }
            System.out.println();
        }
    }
}
