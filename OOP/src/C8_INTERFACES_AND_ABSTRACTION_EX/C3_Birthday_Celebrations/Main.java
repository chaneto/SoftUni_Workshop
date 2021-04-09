package C8_INTERFACES_AND_ABSTRACTION_EX.C3_Birthday_Celebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Birthable> birthables = new ArrayList<> ();
        while (true){
            String[] input = scanner.nextLine ().split (" ");
            if(input[0].equals ("End")){
                break;
            }Birthable birthable = null;
            if(input[0].equals ("Citizen")){
                birthable = new Citizen (input[1],Integer.parseInt (input[2]),input[3],input[4]);
                birthables.add (birthable);
            }else if(input[0].equals ("Pet")){
                birthable= new Pet (input[1],input[2]);
                birthables.add (birthable);
            }
        }
        String p = scanner.nextLine ();
        int count = 0;
        for(Birthable out : birthables){
            String[] personBirth = out.getBirthDate ().split ("/");
            if(personBirth[2] .equals (p)){
                System.out.println (out.getBirthDate ());
                count++;
            }
        }if(count == 0){
            System.out.println ("<no output>");
        }
    }
}
