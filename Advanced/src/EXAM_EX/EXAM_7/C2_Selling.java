package EXAM_EX.EXAM_7;

import java.util.Scanner;

public class C2_Selling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int matrixsize = Integer.parseInt (scanner.nextLine ());
        char[][] matrix = new char[matrixsize][matrixsize];
        int row = 0;
        int col = 0;
        int pillarsRow1 = 0;
        int pillarsCol1 = 0;
        int pillarsRow2 = 0;
        int pillarsCol2 = 0;
        int index = -1;
        int sum = 0;
        for (int i = 0; i < matrixsize; i++) {
            String input = scanner.nextLine ();
            for (int j = 0; j < matrixsize; j++) {
                matrix[i][j] = input.charAt (j);
                if(input.charAt (j) == 'S'){
                    row = i;
                    col = j;
                }if(input.charAt (j) == 'O' && index == -1){
                    pillarsRow1 = i;
                    pillarsCol1 = j;
                    index = i;
                }else if(input.charAt (j) == 'O' && index >= 0){
                    pillarsRow2 = i;
                    pillarsCol2 = j;
                }
            }
        }while (sum < 50){
            String command = scanner.nextLine ();
            matrix[row][col] = '-';
            if(command.equals ("right")){
                col++;
            }else if(command.equals ("left")){
                col--;
            }else if(command.equals ("down")){
                row++;
            }else if(command.equals ("up")){
                row--;
            }if(outOfMatrix (row, col, matrixsize)){
                if(matrix[row][col] == '-'){
                    matrix[row][col] = 'S';
                }else if(Character.isDigit (matrix[row][col])){
                    sum += Character.getNumericValue (matrix[row][col]);
                    matrix[row][col] = 'S';
                }else if(matrix[row][col] == 'O'){
                    matrix[row][col] = '-';
                    if(row == pillarsRow1 && col == pillarsCol1 ){
                        row = pillarsRow2;
                        col = pillarsCol2;
                    }else {
                        row = pillarsRow1;
                        col = pillarsCol1;
                    }matrix[row][col] = 'S';
                }
            }else {
                System.out.println ("Bad news, you are out of the bakery.");
                print (matrix,sum);
                return;
            }
        }
        System.out.println ("Good news! You succeeded in collecting enough money!");
        print (matrix,sum);
    }public static boolean outOfMatrix(int row, int col, int matrixSize){
        return (row >= 0 && col >= 0 && row < matrixSize && col < matrixSize);
    }public static void print(char[][] matrix, int sum){
        System.out.println ("Money: " + sum);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print (matrix[i][j]);
            }
            System.out.println ();
        }
    }
}
