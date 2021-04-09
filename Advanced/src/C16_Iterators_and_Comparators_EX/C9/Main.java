package C16_Iterators_and_Comparators_EX.C9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int size = Integer.parseInt (scanner.nextLine ());
        List<Integer> list = new ArrayList<> ();
        Traversal_1 person = new Traversal_1 (list);
        for (int i = 0; i < size; i++) {
            String[] input = scanner.nextLine ().split (" ");
            if(input[0].equals ("Add")){
                person.Add (Integer.parseInt (input[1]));
            }
            if(input[0].equals ("Remove")){
                person.Remove (Integer.parseInt (input[1]));
            }

        }
        System.out.println (person.size ());

        for(Integer out : person){
            System.out.print (out + " ");
        }
    }
}
