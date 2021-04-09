package C16_Iterators_and_Comparators_EX.C5_Comparing_Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Person> output = new ArrayList<> ();
        Person person;
        while (true){

            String[] input = scanner.nextLine ().split (" ");
            if(input[0].equals ("END")){
                break;
            }
            person = new Person (input[0],Integer.parseInt (input[1]),input[2]);
            output.add (person);
        }
        int name = Integer.parseInt (scanner.nextLine ());
        person = output.get (name - 1);
        int equal = 1;
        output.remove (name - 1);

        for(Person out : output){
            if(out.compareTo (person) == 0){
                equal++;
            }
        }if(equal == 1){
            System.out.println ("No matches");
        }else {
        System.out.printf ("%d %d %d",equal,(output.size () + 1) - equal, output.size () + 1);}
    }
}
