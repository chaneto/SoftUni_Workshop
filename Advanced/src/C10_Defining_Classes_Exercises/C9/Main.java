package C10_Defining_Classes_Exercises.C9;
import C10_Defining_Classes_Exercises.C9.Cat;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Map<String, Cat> map = new HashMap<> ();
        while (true) {
            String[] input = scanner.nextLine ().split (" ");
            if (input[0].equals ("End")) {
                break;
            }
            String breeds = input[0];
            String name = input[1];
            double size = Double.parseDouble (input[2]);
            Cat cat = new Cat (breeds, name, size);
            map.put (name, cat);

        }
        String p = scanner.nextLine ();
        System.out.printf ("%s %s %.2f",map.get (p).getBreeds (),
                map.get (p).getName (),map.get (p).getSize ());
    }
    }