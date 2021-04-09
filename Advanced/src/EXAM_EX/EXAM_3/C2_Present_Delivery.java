package EXAM_EX.EXAM_3;

import java.util.Scanner;

public class C2_Present_Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int gift = Integer.parseInt (scanner.nextLine ());
        int sizematrix = Integer.parseInt (scanner.nextLine ());
        String[][] matrix = new String[sizematrix][sizematrix];
        int row = 0;
        int col = 0;
        int nicekid = 0;
        int count = 0;
        for (int i = 0; i < sizematrix; i++) {
            String[] input = scanner.nextLine ().split (" ");
            for (int j = 0; j < input.length; j++) {
                if(input[j].equals ("S")){
                    row = i;
                    col = j;
                }if(input[j].equals ("V")){
                    nicekid++;
                }
                matrix[i][j] = input[j];
            }
        }while (true){
            String command = scanner.nextLine ();
            if(command.equals ("Christmas morning")){
                break;
            }if(command.equals ("up")){
                row --;
                if(isvalid (row,col,sizematrix)){
                    XV (matrix,row,col,count,gift,nicekid);
                }
                else {
                    System.out.println ("Santa ran out of presents!");
                    print (matrix, count, gift, nicekid);
                    return;
                }
                matrix[row + 1][col] = "-";
            }else if(command.equals ("down")){
                row++;
                if(isvalid (row,col,sizematrix)){
                    XV (matrix,row,col,count,gift,nicekid);
                }
                else {
                    System.out.println ("Santa ran out of presents!");
                    print (matrix, count, gift, nicekid);
                    return;
                }matrix[row - 1][col] = "-";

            }else if(command.equals ("left")){
                col--;
                if(isvalid (row,col,sizematrix)){
                    XV (matrix,row,col,count,gift,nicekid);
                }
                else {
                    System.out.println ("Santa ran out of presents!");
                    print (matrix, count, gift, nicekid);
                    return;
                }matrix[row][col + 1] = "-";
            }else if(command.equals ("right")){
                col++;
                if(isvalid (row,col,sizematrix)){
                    XV (matrix,row,col,count,gift,nicekid);
                }
                else {
                    System.out.println ("Santa ran out of presents!");
                    print (matrix, count, gift, nicekid);
                    return;
                }matrix[row][col - 1] = "-";
            }
        }print (matrix, count, gift, nicekid);
    }public static boolean isvalid(int row, int col, int size){
        return (row >= 0 || row < size || col >= 0 || col < size);
    }public static void operation(String[][] matrix,int row,int col,int count, int gift,int nicekid){
        matrix[row][col] = "S";
        for (int i = 0; i < 4; i++) {
            if(i == 0){
                row--;
                C (matrix,row,col,count,gift,nicekid);
                row++;
            }else if(i == 1){
                row++;
                C (matrix,row,col,count,gift,nicekid);
                row--;
            }else if(i == 2){
                col--;
                C (matrix,row,col,count,gift,nicekid);
                col++;
            }else {
            col++;
            C (matrix,row,col,count,gift,nicekid);
            col--;
            }
        }



    }public static void print(String[][] matrix, int count, int gift, int nicekid){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print (matrix[i][j] + " ");
            }
            System.out.println ();
        }if(count == nicekid){
            System.out.printf ("Good job, Santa! %d happy nice kid/s.",count);
        }else {
            System.out.printf ("No presents for %d nice kid/s.",nicekid - count);
        }
    }public static void C(String[][] matrix,int row,int col,int count, int gift,int nicekid){
        if(isvalid (row,col,nicekid)){
            if(matrix[row][col].equals ("V") || matrix[row][col].equals ("X")){
                matrix[row][col] = "-";
                gift--;
                count++;
                if(gift <= 0 && count < nicekid){
                    System.out.println ("Santa ran out of presents!");
                    print (matrix, count, gift, nicekid);
                }if(gift <= 0 && count >= nicekid){
                    print (matrix, count, gift, nicekid);
                }
            }
        }
    }public static void XV(String[][] matrix,int row,int col,int count, int gift,int nicekid){
        if(matrix[row][col].equals ("-") || matrix[row][col].equals ("X")){
            matrix[row][col] = "S";
        }else if(matrix[row][col].equals ("V")){
            matrix[row][col] = "S";
            count ++;
            gift--;
            if(gift <= 0 && count < nicekid){
                System.out.println ("Santa ran out of presents!");
                print (matrix, count, gift, nicekid);
            }if(gift <= 0 && count >= nicekid){
                print (matrix, count, gift, nicekid);
            }


        }else if(matrix[row][col].equals ("C")){
            operation (matrix,row,col,count,gift,nicekid);
        }

    }
}
