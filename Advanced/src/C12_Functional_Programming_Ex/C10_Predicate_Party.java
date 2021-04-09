package C12_Functional_Programming_Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class C10_Predicate_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<String> nameinput = Arrays.stream (scanner.nextLine ().split (" ")).collect(Collectors.toList());
        Predicate<String> predicate = null;
        while (true){
            String[] comandinput = scanner.nextLine ().split (" ");
            if(comandinput[0].equals ("Party!")){
                break;
            }
            String comand = comandinput[0];
            String with = comandinput[1];
            String part = comandinput[2];
            if(with.equals ("StartsWith")){
                predicate = f -> f.startsWith (part);
            }
            else if(with.equals ("EndsWith")){
                predicate = f -> f.endsWith (part);
            }
            else if(with.equals ("Length")){
                predicate = f -> f.length () == Integer.parseInt (part);

            }
            if(comand.equals ("Remove")){
                for (int i = 0; i < nameinput.size (); i++) {
                    nameinput.removeIf (predicate);
                }
            }else if(comand.equals ("Double")){
                for (int i = nameinput.size () - 1; i >= 0; i--) {
                    if(with.equals ("Length")){
                        int size = nameinput.get (i).length ();
                        if(nameinput.get (i).length () == Integer.parseInt (part)){
                            nameinput.add (nameinput.get (i));

                        }
                    }else {
                       if(predicate.test (nameinput.get (i))){
                            nameinput.add (nameinput.get (i));
                        }


                    }
                }
            }
        }if(nameinput.isEmpty ()){
            System.out.println ("Nobody is going to the party!");
        }else {
            int[] count = new int[1];
            nameinput.stream ()
                    .sorted ()
                    .forEach (f -> {
                        count[0]++;
                        if (count[0] < nameinput.size ()) {
                            System.out.print (f + ", ");
                        } else {
                            System.out.print (f);
                        }
                    });System.out.println (" are going to the party!");
        }

    }
}
