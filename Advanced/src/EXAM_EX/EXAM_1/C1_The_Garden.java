package EXAM_EX.EXAM_1;

import java.util.Scanner;

public class C1_The_Garden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int matrixSize = Integer.parseInt (scanner.nextLine ());
        char[][] matrix = new char[matrixSize][];
        int Carrots = 0;
        int  Potatoes = 0;
        int Lettuce = 0;
        int Harmed = 0;
        for (int i = 0; i < matrixSize; i++) {
            String[] input = scanner.nextLine ().split (" ");
            matrix[i] = new char[input.length];
            for (int j = 0; j < input.length; j++) {
                matrix[i][j] = input[j].charAt (0);
            }
        }while (true){
            String p = scanner.nextLine ();
            if(p.equals ("End of Harvest")){
                break;
            }String[] commandArray = p.split (" ");
            String command = commandArray[0];
            int row = Integer.parseInt (commandArray[1]);
            int col = Integer.parseInt (commandArray[2]);
            if(command.equals ("Harvest")){
                if(isRange (row, col, matrix)){
                    if(matrix[row][col] == 'L'){
                        Lettuce++;
                    }else if(matrix[row][col] == 'P'){
                        Potatoes++;
                    }else if(matrix[row][col] == 'C'){
                        Carrots++;
                    }matrix[row][col] = ' ';
                }
            }else if(command.equals ("Mole")){
                if(isRange (row, col, matrix)){
                    String move = commandArray[3];
                    if(move.equals ("up")){
                        for (int i = row; i >= 0; i-=2) {
                            if(matrix[i][col] != ' '){
                                Harmed++;
                            }
                            matrix[i][col] = ' ';
                        }
                    }else if(move.equals ("down")){
                        for (int i = row; i < matrix.length; i+=2) {
                            if(matrix[i][col] != ' '){
                                Harmed++;
                            }
                            matrix[i][col] = ' ';
                        }
                    }else if(move.equals ("right")){
                        for (int i = col; i < matrix[row].length; i+=2) {
                            if(matrix[row][i] != ' '){
                                Harmed++;
                            }matrix[row][i] = ' ';
                        }
                    }else if(move.equals ("left")){
                        for (int i = col; i >= 0 ; i-=2) {
                            if(matrix[row][i] != ' '){
                                Harmed++;
                            }matrix[row][i] = ' ';
                        }
                    }
                }
            }
        }
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print (matrix[i][j] + " ");
            }
            System.out.println ();
        }
        System.out.printf ("Carrots: %d%nPotatoes: %d%nLettuce: %d%nHarmed vegetables: %d",Carrots, Potatoes, Lettuce,Harmed);

    }public static boolean isRange(int row, int col, char[][] matrix){
        return (row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length);
    }
}
