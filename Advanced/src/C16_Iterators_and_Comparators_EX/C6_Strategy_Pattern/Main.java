package C16_Iterators_and_Comparators_EX.C6_Strategy_Pattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int size = Integer.parseInt (scanner.nextLine ());
        Set<Person> name = new TreeSet<> (new PersonbyName ());
        Set<Person> age = new TreeSet<> (new PersonbyAge ());
        for (int i = 0; i < size; i++) {
            String[] input = scanner.nextLine ().split (" ");
            Person person = new Person (input[0],Integer.parseInt (input[1]));
            name.add (person);
            age.add (person);
        }for(Person out : name){
            System.out.println (out.getName () + " " + out.getAge ());
        }for(Person out : age){
            System.out.println (out.getName () + " " + out.getAge ());
        }
    }
}
