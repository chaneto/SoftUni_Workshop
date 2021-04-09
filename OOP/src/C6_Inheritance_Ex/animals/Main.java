package C6_Inheritance_Ex.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<String> list = new ArrayList<> ();
        while (true){
            String input = scanner.nextLine ();
            if(input.equals ("Beast!")){break;}
            list.add (input);
        }
        for (int i = 0; i < list.size (); i+=2) {
            String name = list.get (i);
            String[] p = list.get (i + 1).split (" ");
            if(name.equals ("Dog")){
                try {
                    Dog dog = new Dog (p[0],Integer.parseInt (p[1]),p[2]);
                    System.out.println (dog.toString ());
                }catch (IllegalArgumentException e){
                    System.out.println (e.getMessage ());
                }
            }else if(name.equals ("Cat")){
                try {
                    Cat cat = new Cat (p[0],Integer.parseInt (p[1]),p[2]);
                    System.out.println (cat.toString ());
                }catch (IllegalArgumentException e){
                    System.out.println (e.getMessage ());
                }
            }else if(name.equals ("Frog")){
                try {
                    Frog frog = new Frog (p[0],Integer.parseInt (p[1]),p[2]);
                    System.out.println (frog.toString ());
                }catch (IllegalArgumentException e){
                    System.out.println (e.getMessage ());
                }
            }else if(name.equals ("Kitten")){
                try {
                    Kitten kitten = new Kitten (p[0],Integer.parseInt (p[1]));
                    System.out.println (kitten.toString ());
                }catch (IllegalArgumentException e){
                    System.out.println (e.getMessage ());
                }
            }else if(name.equals ("Tomcat")){
                try {
                    Tomcat tomcat = new Tomcat (p[0],Integer.parseInt (p[1]));
                    System.out.println (tomcat.toString ());
                }catch (IllegalArgumentException e){
                    System.out.println (e.getMessage ());
                }
            }
        }
    }
}
