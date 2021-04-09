package C16_Iterators_and_Comparators_EX.C2_Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<String> list = Arrays.stream (scanner.nextLine ().split (" ")).collect(Collectors.toList());
        list.remove (0);
        Collection collection = new Collection (list);
        while (true){
            String p = scanner.nextLine ();
            if(p.equals ("END")){
                break;
            }
            if(p.equals ("Move")){
                System.out.println (collection.move ());
            }
            if(p.equals ("Print")){
                System.out.println (collection.Print ());
            }
            if(p.equals ("HasNext")){
                System.out.println (collection.HasNext ());
            }
            if(p.equals ("PrintAll")){
                collection.PrintAll ();
            }
        }
    }
}
