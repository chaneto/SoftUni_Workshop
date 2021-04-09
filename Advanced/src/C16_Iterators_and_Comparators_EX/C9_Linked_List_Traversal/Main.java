package C16_Iterators_and_Comparators_EX.C9_Linked_List_Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Integer> list = new ArrayList<> ();
        Traversal traversal = new Traversal (list);
        int size = Integer.parseInt (scanner.nextLine ());
        for (int i = 0; i < size; i++) {
            String[] p = scanner.nextLine ().split (" ");
            if(p[0].equals ("Add")){
                traversal.Add (Integer.parseInt (p[1]));
            }if(p[0].equals ("Remove")){
                traversal.Remove (Integer.parseInt (p[1]));
            }
        }
        System.out.println (traversal.getSize ());
        for (int i = 0; i < traversal.getSize (); i++) {
            System.out.print(traversal.getList ().get (i) + " ");
        }
    }
}
