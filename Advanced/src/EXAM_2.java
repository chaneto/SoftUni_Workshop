import java.util.Scanner;

public class EXAM_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int matrixSize = Integer.parseInt (scanner.nextLine ());
        String[] arrcommand = scanner.nextLine ().split (",");
        String[][] matrix = new String[matrixSize][matrixSize];
        int row = 0;
        int col = 0;
        int countB = 0;
        int rowEnd = 0;
        int colEnd = 0;
        for (int i = 0; i < matrixSize; i++) {
            String[] input = scanner.nextLine ().split (" ");;
            for (int j = 0; j < input.length; j++) {
                matrix[i][j] = input[j];
                if(input[j].equals ("s")){
                    row = i;
                    col = j;
                }if(input[j].equals ("B")){
                    countB++;
                }if(input[j].equals ("e")){
                    rowEnd = i;
                    colEnd = j;
                }
            }
        }
        for (int i = 0; i < arrcommand.length; i++) {
            String command = arrcommand[i];
            if(command.equals ("right") || command.equals ("left")){
                col = move (row, col, command);
            }else {
                row = move (row, col, command);
            }if(command.equals ("right") || command.equals ("left")){
                col = outOfMatrix (row, col,matrixSize, command);
            }else {
                row = outOfMatrix (row, col,matrixSize, command);
            }if(matrix[row][col].equals ("e")){
                System.out.printf ("END! %d bombs left on the field",countB);
                return;
            }else if(matrix[row][col].equals ("B")){
                System.out.println ("You found a bomb!");
                countB--;
                matrix[row][col] = "+";
                if(countB <= 0){
                    System.out.println ("Congratulations! You found all bombs!");
                    return;
                }
            }
        }
        System.out.printf ("%d bombs left on the field. Sapper position: (%d,%d)",countB,row,col);
    }
    public static int outOfMatrix(int row, int col,int matrixSize, String command){
        if(command.equals ("right")){
            if(col >= matrixSize){
            col--;
            }
        }else if(command.equals ("left")){
            if(col < 0){
            col++;
            }
        }else if(command.equals ("down")){
            if(row >= matrixSize){
            row--;
            }
        }else if(command.equals ("up")){
            if(row < 0){
            row++;
            }
        }if(command.equals ("right") || command.equals ("left")){
            return col;
        }else {
            return row;
        }
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
    }
}
