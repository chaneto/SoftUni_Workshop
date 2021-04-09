package C12_Functional_Programming_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C9_List_of_Predicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int input = Integer.parseInt (scanner.nextLine ());
        int[] num = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
        for (int i = 1; i <= input; i++) {
            boolean yes = true;
            for (int j = 0; j < num.length; j++) {
                if(i %num[j] != 0){
                    yes = false;
                }
            }if(yes){
                System.out.print (i + " ");
            }
        }
    }
}
