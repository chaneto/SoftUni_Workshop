package EXAM_EX.EXAM_5;

import java.util.Scanner;

public class C2_Snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int matrixSize = Integer.parseInt (scanner.nextLine ());
        char[][] matrix = new char[matrixSize][matrixSize];
        int row = 0;
        int col = 0;
        int burrows1Row = 0;
        int burrows2Row = 0;
        int burrows1Col = 0;
        int burrows2Col = 0;
        int B = -1;
        int count = 0;
        for (int i = 0; i < matrixSize; i++) {
            String input = scanner.nextLine ();
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = input.charAt (j);
                if(input.charAt (j) == 'S'){
                    row = i;
                    col = j;
                }if(input.charAt (j) == 'B' && B == -1){
                    burrows1Row = i;
                    burrows1Col = j;
                    B = i;
                }else if(input.charAt (j) == 'B' && B >= 0){
                    burrows2Row = i;
                    burrows2Col = j;
                }
            }
        }while (count < 10){
            String command = scanner.nextLine ();
            matrix[row][col] = '.';
            if(command.equals ("right")){
                col++;
            }else if(command.equals ("left")){
                col--;
            }else if(command.equals ("down")){
                row++;
            }else if(command.equals ("up")){
                row--;
            }
            if(outOfMatrix (row, col, matrixSize)){
                if(matrix[row][col] == '-'){
                    matrix[row][col] = 'S';
                }else if(matrix[row][col] == '*'){
                    matrix[row][col] = 'S';
                    count++;
                }else if(matrix[row][col] == 'B'){
                    matrix[row][col] = '.';
                    if(row == burrows1Row && col == burrows1Col){
                        row = burrows2Row;
                        col = burrows2Col;
                    }else if(row == burrows2Row && col == burrows2Col){
                        row = burrows1Row;
                        col = burrows1Col;
                    }matrix[row][col] = 'S';
                }
            }else {
                System.out.println ("Game over!");
                System.out.println ("Food eaten: " + count);
                print (matrix);
                return;
            }
        }
        System.out.println ("You won! You fed the snake.");
        System.out.println ("Food eaten: " + count);
        print (matrix);
    }public static boolean outOfMatrix(int row, int col, int sizeMatrix){
        return (row >= 0 && row < sizeMatrix && col >= 0 && col < sizeMatrix);
    }public static void  print(char[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print (matrix[i][j]);
            }
            System.out.println ();
        }
    }
}
