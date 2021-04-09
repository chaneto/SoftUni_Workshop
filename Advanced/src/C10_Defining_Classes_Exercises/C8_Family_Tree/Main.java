package C10_Defining_Classes_Exercises.C8_Family_Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        List<Person> people = new ArrayList<> ();
        List<Person> tree = new ArrayList<> ();
        while (true){
            String[] input = scanner.nextLine().split(" ");
            if(input[0].equals("End")){break;}
            Person person;
            String namecurrent = "";
            if(input.length == 3 && Character.isDigit (input[2].charAt (0)) && !input[1].equals ("-")){
                namecurrent = input[0] + " " + input[1];
                person = new Person (namecurrent,input[2]);
                people.add (person);
            }else {
                if(input.length == 3){
                    //data - data
                    person = new Person (input[0],input[2]);
                    tree.add (person);
                }else if(input.length == 4){
                    if(Character.isDigit (input[0].charAt (0))){
                        //data - name
                        namecurrent = input[2] + " " + input[3];
                        person = new Person (input[0], namecurrent);
                        tree.add (person);
                    }else {
                       // name - data
                        namecurrent = input[0] + " " + input[1];
                        person = new Person (namecurrent, input[3]);
                        tree.add (person);
                    }
                }else if(input.length == 5){
                    //name - name
                    namecurrent = input[0] + " " + input[1];
                    String namecurrent1 = input[3] + " " + input[4];
                    person = new Person (namecurrent, namecurrent1);
                    tree.add (person);
                }
            }
        }Person person;
        for (int i = 0; i < people.size (); i++) {
            String current = "";
            if(Character.isDigit (name.charAt (0))){
                current = people.get (i).getDate ();
            }else {
                current = people.get (i).getName ();
            }if(name.equals (current)){
                person = new Person (people.get (i).getName (), people.get (i).getDate ());
                people.remove (i);
                System.out.println ();
            }
        }
    }
}
