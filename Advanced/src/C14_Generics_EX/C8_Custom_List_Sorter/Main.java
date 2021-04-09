package C14_Generics_EX.C8_Custom_List_Sorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        CustomListSorter<String> list = new CustomListSorter<> ();
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
                list.remove (input[1]);
            }
            else if(command.equals ("Swap")){
                list.swap (Integer.parseInt (input[1]), Integer.parseInt (input[2]));
            }
            else if(command.equals ("Contains")){
                System.out.println (list.contains (input[1]));
            }
            else if(command.equals ("Greater")){
                System.out.println (list.count (input[1]));
            }
            else if(command.equals ("Max")){
                System.out.println (list.getMax ());
            }
            else if(command.equals ("Min")){
                System.out.println (list.getMin ());
            }
            else if(command.equals ("Sort")){
                list.sorted ();
            }
            else if(command.equals ("Print")){
                list.Print();
            }


        }
    }
}
