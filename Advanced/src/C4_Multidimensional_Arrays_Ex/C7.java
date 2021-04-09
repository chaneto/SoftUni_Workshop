package C4_Multidimensional_Arrays_Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] matrixsize = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
        int rows = matrixsize[0];
        int cols = matrixsize[1];
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();

        int couter = 0;
        for (int i = 0; i < rows; i++) {
            matrix.add (new ArrayList<Integer> ());
            for (int j = 0; j < cols; j++) {

                couter++;
                matrix.get (i).add (couter);
            }
        }while (true){
            String p = scanner.nextLine ();
            if(p.equals ("Nuke it from orbit")){
                break;
            }String [] comand = p.split (" ");
            int row = Integer.parseInt (comand[0]);
            int col = Integer.parseInt (comand[1]);
            int r = Integer.parseInt (comand[2]);
            if(row >= 0 && row < matrix.size () && col >= 0 && col < matrix.get (row).size () ) {
                int start = col - r;
                if (start < 0) {
                    start = 0;
                }
                for (int i = start; i < matrix.get (row).size (); i++) {
                    int rrr = matrix.get (row).get (i);
                    matrix.get (row).remove (i);
                    i--;
                }
                int start1 = row - r;
                if (start1 < 0) {
                    start1 = 0;
                }
                for (int i = start1; i < matrix.size (); i++) {
                    if (i != row) {
                        matrix.get (i).remove (col);
                    }
                }
                int max = 0;
                for (int i = 0; i < matrix.size (); i++) {
                    if (matrix.get (i).size () > max) {
                        max = matrix.get (i).size ();
                    }
                }
                for (int i = 0; i < matrix.size (); i++) {
                    for (int j = 0; j < max; j++) {
                        if (matrix.get (i).size () - 1 < j) {
                            matrix.get (i).add (0);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < matrix.size (); i++) {
            for (int j = 0; j < matrix.get (i).size (); j++) {
                if(matrix.get (i).get (j) != 0){
                    System.out.print (matrix.get (i).get (j) + " ");
                }

            }System.out.println ();
        }
    }
}
