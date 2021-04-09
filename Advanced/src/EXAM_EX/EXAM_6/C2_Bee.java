package EXAM_EX.EXAM_6;

import java.util.Scanner;

public class C2_Bee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int matrixSize = Integer.parseInt (scanner.nextLine ());
        char[][] matrix = new char[matrixSize][matrixSize];
        int row = 0;
        int col = 0;
        int bonusRow = 0;
        int bonusCol = 0;
        int countflowers = 0;
        for (int i = 0; i < matrixSize; i++) {
            String input = scanner.nextLine ();
            for (int j = 0; j < input.length (); j++) {
                matrix[i][j] = input.charAt (j);
                if(input.charAt (j) == 'B'){
                    row = i;
                    col = j;
                }if(input.charAt (j) == 'O'){
                    bonusRow = i;
                    bonusCol = j;
                }
            }
        }while (true){
            String command = scanner.nextLine ();
            if(command.equals ("End")){break;}
            matrix[row][col] = '.';
            if(command.equals ("right") || command.equals ("left")){
                col = move (row, col, command);
            }
            else {
                row = move (row, col, command);
            }
            if(outOfMatrix (row, col,matrixSize)){
            if(matrix[row][col] == '.'){
                matrix[row][col] = 'B';
            }else if(matrix[row][col] == 'f'){
                countflowers++;
                matrix[row][col] = 'B';
            }else if(matrix[row][col] == 'O'){
                matrix[row][col] = '.';
                if(command.equals ("right") || command.equals ("left")){
                    col = move (row, col, command);
                }
                else {
                    row = move (row, col, command);
                }
                if(outOfMatrix (row, col, matrixSize)){
                    if(matrix[row][col] == 'f'){
                        countflowers++;
                    }
                    matrix[row][col] = 'B';
                }else {
                    System.out.println ("The bee got lost!");
                    print (matrix, countflowers);
                    return;
                }
              }
            }else {
                System.out.println ("The bee got lost!");
                print (matrix, countflowers);
                return;
            }
        }print (matrix, countflowers);
    }public static boolean outOfMatrix(int row, int col, int matrixsize){
        return (row >= 0 && row < matrixsize && col >= 0 && col < matrixsize);
    }public static int move(int row, int col, String command){
        if(command.equals ("right")){
            col++;
        }else if(command.equals ("left")){
            col--;
        }else if(command.equals ("down")){
            row++;
        }else if(command.equals ("up")){
            row--;
        }if(command.equals ("right") || command.equals ("left")){
            return col;
        }else {
            return row;
        }
    }public static void print(char[][] matrix, int countflower){
        if(countflower >= 5){
            System.out.printf ("Great job, the bee manage to pollinate %d flowers!%n",countflower);
        }else {
            System.out.printf ("The bee couldn't pollinate the flowers, she needed %d flowers more%n",5 - countflower);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print (matrix[i][j]);
            }
            System.out.println ();
        }
    }
}
