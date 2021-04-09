package EXAM_EX.EXAM_4;

import java.util.Scanner;

public class C2_Re_Volt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int matrixSize = Integer.parseInt (scanner.nextLine ());
        int commandNum = Integer.parseInt (scanner.nextLine ());
        char[][] matrix = new char[matrixSize][matrixSize];
        int row = 0;
        int col = 0;
        for (int i = 0; i < matrixSize; i++) {
            String input = scanner.nextLine ();
            for (int j = 0; j < input.length (); j++) {
                if(input.charAt (j) == 'f'){
                    row = i;
                    col = j;
                }
                matrix[i][j] = input.charAt (j);
            }
        }while (commandNum > 0){
            String command = scanner.nextLine ();
            commandNum--;
            matrix[row][col] = '-';
            if(command.equals ("right") || command.equals ("left")){
                col = move (row, col, command, matrixSize);
            }else {
                row = move (row, col, command, matrixSize);
            }if (F (row, col, matrix)){
                matrix[row][col] = 'f';
                System.out.println ("Player won!");
                print (matrix);
                return;
            }

            if(matrix[row][col] == '-'){
                matrix[row][col] = 'f';
            }else if(matrix[row][col] == 'B'){
                if(command.equals ("right") || command.equals ("left")){
                    col = move (row, col, command, matrixSize);
                }else {
                    row = move (row, col, command, matrixSize);
                }if (F (row, col, matrix)){
                    matrix[row][col] = 'f';
                    System.out.println ("Player won!");
                    print (matrix);
                    return;
                }else {
                    matrix[row][col] = 'f';
                }

            }else if(matrix[row][col] == 'T'){
                if(command.equals ("right") || command.equals ("left")){
                    col = T (row, col, command, matrixSize);
                }else {
                    row = T (row, col, command, matrixSize);
                }
                if (F (row, col, matrix)){
                    matrix[row][col] = 'f';
                    System.out.println ("Player won!");
                    print (matrix);
                    return;
                }else {
                    matrix[row][col] = 'f';
                }
            }
        }
        System.out.println ("Player lost!");
        print (matrix);

    }public static boolean F(int row, int col, char[][] matrix){
        return matrix[row][col] == 'F';
    }
    public static int move(int row, int col, String command, int matrixSize){
        switch (command){
            case "right":
                col++;
                if(col >= matrixSize){
                    col = 0;
                }
                break;
            case "left":
                col--;
                if(col < 0){
                    col = matrixSize - 1;
                }

                break;
            case "down":
                row++;
                if(row >= matrixSize){
                    row = 0;
                }
                break;
            case "up":
                row--;
                if(row < 0){
                    row = matrixSize - 1;
                }
        }if(command.equals ("right") || command.equals ("left")){
            return col;
        }else {
            return row;
        }
    }public static int T(int row, int col, String command, int matrixSize){
        switch (command){
            case "right":
                col--;
                if(col < 0){
                    col = matrixSize - 1;
                }
                break;
            case "left":
                col++;
                if(col >= matrixSize){
                    col = 0;
                }

                break;
            case "down":
                row--;
                if(row < 0){
                    row = matrixSize - 1;
                }
                break;
            case "up":
                row++;
                if(row >= matrixSize){
                    row = 0;
                }
        }if(command.equals ("right") || command.equals ("left")){
            return col;
        }else {
            return row;
        }
    }public static void print(char[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print (matrix[i][j]);
            }
            System.out.println ();
        }
    }
}
