package C4_Multidimensional_Arrays_Ex;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C6_Matrix_Rotation_Neu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String p = scanner.nextLine ();
        int index = p.indexOf ("(");
        int index1 = p.indexOf (")");
        int rotate = Integer.parseInt (p.substring (index + 1,index1));
        if(rotate >= 360){
            rotate = rotate % 360;
        }
        int row = 0;
        int col = 0;
        Deque<String> deque = new ArrayDeque<> ();
        while (true){
            String in = scanner.nextLine ();
            if(in.equals ("END")){
                break;
            }row++;
            if(in.length () > col){
                col = in.length ();
            }deque.offer (in);
        }Character[][] matrix = new Character[row][col];
        for (int i = 0; i < row; i++) {
            String word = deque.poll();
            for (int j = 0; j < col; j++) {
                if(j < word.length ()){
                    matrix[i][j] = word.charAt (j);
                }else {
                    matrix[i][j] = ' ';
                }

            }

        }if(rotate == 0){
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print (matrix[i][j]);
                }
                System.out.println ();
            }
        }if(rotate == 90){
            for (int i = 0; i < col; i++) {
                for (int j = row - 1; j >= 0 ; j--) {
                    System.out.print (matrix[j][i]);
                }
                System.out.println ();
            }
        }if(rotate == 180){
            for (int i = row - 1; i >= 0 ; i--) {
                for (int j = col - 1; j >= 0 ; j--) {
                    System.out.print (matrix[i][j]);
                }
                System.out.println ();
            }
        }if(rotate == 270){
            for (int i = col - 1; i >= 0 ; i--) {
                for (int j = 0; j < row; j++) {
                    System.out.print (matrix[j][i]);
                }
                System.out.println ();
            }
        }
    }
}
