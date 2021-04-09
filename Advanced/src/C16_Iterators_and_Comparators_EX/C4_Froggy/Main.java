package C16_Iterators_and_Comparators_EX.C4_Froggy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] input = Arrays.stream (scanner.nextLine ().split (", ")).mapToInt (Integer::parseInt).toArray ();
        Froggy froggy = new Froggy (input);
        Iterator it = froggy.iterator ();
        int counter = 0;
        while (it.hasNext ()){
            if(counter < input.length - 1 ){
            System.out.print (it.next () + ", ");
            }else {
                System.out.println (it.next ());
            }
            counter++;
        }
        String out = scanner.nextLine ();
        if(out.equals ("END")){
            return;
        }
    }
}
