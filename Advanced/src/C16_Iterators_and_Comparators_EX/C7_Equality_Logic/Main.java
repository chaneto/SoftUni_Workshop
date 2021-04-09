package C16_Iterators_and_Comparators_EX.C7_Equality_Logic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int size = Integer.parseInt (scanner.nextLine ());
        Set<Person> setout = new HashSet<> ();
        Set<Person> set = new TreeSet<> ();
        for (int i = 0; i < size; i++) {
            String[] input = scanner.nextLine ().split (" ");
            Person equality_logic = new Person (input[0],Integer.parseInt (input[1]));
            set.add (equality_logic);
            setout.add (equality_logic);
        }for(Person out : set){
            setout.add (out);
        }
        System.out.println (setout.size ());
        System.out.println (set.size ());
    }
}
