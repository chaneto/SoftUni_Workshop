package C14_Generics_EX.C7_Custom_List;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Customlist<String> list = new Customlist<> ();
        while (true){
            String[] input = scanner.nextLine ().split (" ");
            String command = input[0];
            if(command.equals ("END")){
                break;
            }
            if(command.equals ("Add")){
                list.add (input[1]);
            }
            else if(command.equals ("Remove")){
                list.remove (Integer.parseInt (input[1]));
            }
            else if(command.equals ("Swap")){
                list.swap (Integer.parseInt (input[1]), Integer.parseInt (input[2]));
            }
            else if(command.equals ("Contains")){
                System.out.println (list.contains (input[1]));
            }
            else if(command.equals ("Greater")){
                System.out.println (list.countGreaterThan (input[1]));
            }
            else if(command.equals ("Max")){
                System.out.println (list.getMax ());
            }
            else if(command.equals ("Min")){
                System.out.println (list.getMin ());
            }

            else if(command.equals ("Print")){
                System.out.println (list.toString ());
            }


        }
    }
}
