package EXAM_EX.EXAM_2;

import java.util.Scanner;

public class C2_Book_Worm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String word = scanner.nextLine ();
        int mtrixsize = Integer.parseInt (scanner.nextLine ());
        String[][] matrix = new String[mtrixsize][mtrixsize];
        int row = 0;
        int col = 0;
        for (int i = 0; i < mtrixsize; i++) {
            String[] input = scanner.nextLine ().split ("");
            for (int j = 0; j < mtrixsize; j++) {
                matrix[i][j] = input[j];
                if(input[j].equals ("P")){
                    row = i;
                    col = j;
                }
            }
        }while (true){
            String command = scanner.nextLine ();
            if(command.equals ("end")){
                break;
            }matrix[row][col] = "-";
            if(command.equals ("right")){
                col++;
                if(isRange (row,col,mtrixsize)){
                    if(!matrix[row][col].equals ("-")){
                        word += matrix[row][col];
                    }matrix[row][col] = "P";
                }else {
                    col--;
                    matrix[row][col] = "P";
                    if(word.length () > 0){
                        word = word.substring (0, word.length () - 1);
                    }
                }
            }else if(command.equals ("left")){
                col--;
                if(isRange (row,col,mtrixsize)){
                    if(!matrix[row][col].equals ("-")){
                        word += matrix[row][col];
                    }matrix[row][col] = "P";
                }else {
                    col++;
                    matrix[row][col] = "P";
                    if(word.length () > 0){
                        word = word.substring (0, word.length () - 1);
                    }
                }
            }else if(command.equals ("down")){
                row++;
                if(isRange (row,col,mtrixsize)){
                    if(!matrix[row][col].equals ("-")){
                        word += matrix[row][col];
                    }matrix[row][col] = "P";
                }else {
                    row--;
                    matrix[row][col] = "P";
                    if(word.length () > 0){
                        word = word.substring (0, word.length () - 1);
                    }
                }
            }else if(command.equals ("up")){
                row--;
                if(isRange (row,col,mtrixsize)){
                    if(!matrix[row][col].equals ("-")){
                        word += matrix[row][col];
                    }matrix[row][col] = "P";
                }else {
                    row++;
                    matrix[row][col] = "P";
                    if(word.length () > 0){
                        word = word.substring (0, word.length () - 1);
                    }
                }
            }
        }
        System.out.println (word);
        for (int i = 0; i < mtrixsize; i++) {
            for (int j = 0; j < mtrixsize; j++) {
                System.out.print (matrix[i][j]);
            }
            System.out.println ();
        }

    }public static boolean isRange(int row, int col, int matrixSize){
        return (row >= 0 && col >= 0 && row < matrixSize && col < matrixSize);
    }
}
