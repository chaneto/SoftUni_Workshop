package C3_Multidimensional_Arrays;

import java.util.Scanner;

public class C7_neu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[][] matrix = new String[8][8];
        for (int i = 0; i < matrix.length; i++) {
            String[] in = scanner.nextLine ().split (" ");
            for (int j = 0; j < in.length; j++) {
                matrix[i][j] = in[j];
            }
        }int row = 0;
        int col = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j].equals ("q")){
                    int count = 0;
                    for (int k = 0; k < matrix[i].length; k++) {
                        if(matrix[i][k].equals ("q")){
                            count++;
                            if(count > 1){break;}
                        }
                    }if(count > 1){break;}


                    for (int k = 0; k < matrix.length; k++) {
                        if(matrix[k][j].equals ("q")){
                            count++;
                            if(count > 2){break;}
                        }
                    }if(count > 2){break;}
                    row = i;
                    col = j;
                    if(row > col){
                        row = row - col;
                        col = 0;
                    } else if(col > row){
                        col = col - row;
                        row = 0;
                    }else {
                        row = 0;
                        col = 0;
                    }
                    while (true){
                        if(row >= matrix.length || col >= matrix[i].length){
                            break;
                        }if(matrix[row][col].equals ("q")){
                            count++;
                            if(count > 3){break;}
                        } String iii = matrix[row][col];
                        row++;
                        col++;
                    }if(count > 3){break;}

                    row = i;
                    col = j;
                    while (true) {
                        row++;
                        col--;
                        if (row >= matrix.length || col < 1) {
                            break;
                        }
                        if (matrix[row][col].equals ("q")) {
                            count++;
                            if(count > 3){break;}
                        }
                    }if(count > 3){break;}
                    row = i;
                    col = j;
                    while (true){
                        row --;
                        col++;
                        if(row < 1 || col >= matrix[i].length){
                            break;
                        }if(matrix[row][col].equals ("q")){
                            count++;
                            if(count > 3){break;}
                        }
                    }if(count > 3){
                        break;
                    }else {
                        System.out.println (i + " " + j);
                        return;
                    }
                }
            }
        }

    }
}
