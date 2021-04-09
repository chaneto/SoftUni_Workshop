package C4_Multidimensional_Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C10_Radioactive_Mutant_Vampire_Bunnies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] a = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
        int row = a[0];
        int col = a[1];
        Character[][]matrix = new Character[row][col];
        int rowplayer = 0;
        int colplayer = 0;
        for (int i = 0; i < row; i++) {
            String p = scanner.nextLine ();
            for (int j = 0; j < col; j++) {
                matrix[i][j] = p.charAt (j);
                if(p.charAt (j) ==  'P'){
                    rowplayer = i;
                    colplayer = j;
                }
            }
        }
        String p = scanner.nextLine ();
        for (int i = 0; i < p.length (); i++) {
            char comand = p.charAt (i);
            if(comand == 'U'){
                rowplayer--;
                if(rowplayer >= 0 && matrix[rowplayer][colplayer] == '.'){
                    matrix[rowplayer][colplayer] = 'P';
                    matrix[rowplayer + 1][colplayer] = '.';
                    matrix = operation (matrix,row,col);
                    if(matrix[rowplayer][colplayer] == 'B'){
                        print (matrix,row,col);
                        System.out.println ("dead: " + rowplayer + " " + colplayer);
                        return;
                    }
                }else {
                    if(rowplayer < 0){
                        rowplayer++;
                        matrix[rowplayer][colplayer] = '.';
                        matrix = operation (matrix,row,col);
                        print (matrix,row,col);
                        System.out.println ("won: " + rowplayer + " " + colplayer);
                    }else {
                        matrix = operation (matrix,row,col);
                        print (matrix,row,col);
                        System.out.println ("dead: " + rowplayer + " " + colplayer);
                    }
                    return;
                }
            }else if(comand == 'L'){
                colplayer--;
                if(colplayer >= 0 && matrix[rowplayer][colplayer] == '.'){
                    matrix[rowplayer][colplayer] = 'P';
                    matrix[rowplayer][colplayer+1] = '.';
                    matrix = operation (matrix,row,col);
                    if(matrix[rowplayer][colplayer] == 'B'){
                        print (matrix,row,col);
                        System.out.println ("dead: " + rowplayer + " " + colplayer);
                        return;
                    }
                }else {
                    if(colplayer < 0){
                        colplayer++;
                        matrix[rowplayer][colplayer] = '.';
                        matrix = operation (matrix,row,col);
                        print (matrix,row,col);
                        System.out.println ("won: " + rowplayer + " " + colplayer);
                    }else {
                        matrix = operation (matrix,row,col);
                        print (matrix,row,col);
                        System.out.println ("dead: " + rowplayer + " " + colplayer);
                    }
                    return;
                }
            }else if(comand == 'R'){
                colplayer++;
                if(colplayer < matrix[rowplayer].length && matrix[rowplayer][colplayer] == '.'){
                    matrix[rowplayer][colplayer] = 'P';
                    matrix[rowplayer][colplayer - 1] = '.';
                    matrix = operation (matrix,row,col);
                    if(matrix[rowplayer][colplayer] == 'B'){
                        print (matrix,row,col);
                        System.out.println ("dead: " + rowplayer + " " + colplayer);
                        return;
                    }
                }else {
                    if(colplayer >= col){
                        colplayer--;
                        matrix[rowplayer][colplayer] = '.';
                        matrix = operation (matrix,row,col);
                        print (matrix,row,col);
                        System.out.println ("won: " + rowplayer + " " + colplayer);
                    }else {
                        matrix = operation (matrix,row,col);
                        print (matrix,row,col);
                        System.out.println ("dead: " + rowplayer + " " + colplayer);
                    }
                    return;
                }
            }else if(comand == 'D'){
                rowplayer++;
                if(rowplayer < matrix.length && matrix[rowplayer][colplayer] == '.'){
                    matrix[rowplayer][colplayer] = 'P';
                    matrix[rowplayer-1][colplayer] = '.';
                    matrix = operation (matrix,row,col);
                    if(matrix[rowplayer][colplayer] == 'B'){
                        print (matrix,row,col);
                        System.out.println ("dead: " + rowplayer  + " " + colplayer);
                        return;
                    }
                }else {
                    if(rowplayer >= row){
                        rowplayer--;
                        matrix[rowplayer][colplayer] = '.';
                        matrix = operation (matrix,row,col);
                        print (matrix,row,col);
                        System.out.println ("won: " + rowplayer + " " + colplayer);
                    }else {
                        matrix = operation (matrix,row,col);
                        print (matrix,row,col);
                        System.out.println ("dead: " + rowplayer + " " + colplayer);
                    }
                    return;
                }
            }
        }


    }public static Character[][] print(Character[][] matrix, int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print (matrix[i][j]);
            }
            System.out.println ();
        }return matrix;
    }
    public static Character[][] operation(Character[][] matrix,int row, int col){
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {
                char ttt = matrix[j][k];
                if(matrix[j][k] == 'B'){
                    if(j + 1 < matrix.length && matrix[j + 1][k] != 'B'){
                        matrix[j + 1][k] = 'b';
                    }if(j - 1 >= 0 && matrix[j - 1][k] != 'B'){
                        matrix[j - 1][k] = 'b';
                    }if(k + 1 < matrix[j].length && matrix[j][k+1] != 'B'){
                        matrix[j][k+1] = 'b';
                    }if(k - 1 >= 0 && matrix[j][k - 1] != 'B'){
                        matrix[j][k-1] = 'b';
                    }
                }
            }

        } for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                if(matrix[i][k] == 'b') {
                    matrix[i][k] = 'B';
                }
            }

        }
        return matrix;
    }
}
