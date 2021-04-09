package C16_Iterators_and_Comparators_EX.C3_Stack_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String p = scanner.nextLine ();
        List<Character> list = new ArrayList<> ();
        for (int i = 0; i < p.length (); i++) {
            if(Character.isDigit (p.charAt (i))){
                list.add (p.charAt (i));
            }
        }
            StackIterator stackIterator = new StackIterator (list);
            while (true) {
                String[] command = scanner.nextLine ().split (" ");
                if (command[0].equals ("END")) {
                    break;
                }
                if (command[0].equals ("Pop")) {
                    stackIterator.pop ();
                }
                if (command[0].equals ("Push")) {
                    stackIterator.push (command[1]);
                }
            }
            stackIterator.print ();
    }
}
