package C6_Sets_And_Maps_Advanced_EX;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class C7_Neu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine ();
        Map<String,String> map = new LinkedHashMap<> ();
        int counter = -1;
        String name = "";
        while (!input.equals ("stop")){
            counter++;
            if(counter %2 == 0){
                name = input;
            }else {
                String email = input;
                int start = input.indexOf (".");
                String validmeil = input.substring (start + 1);
                if(!validmeil.equals ("us") && !validmeil.equals ("uk") && !validmeil.equals ("com")){
                    map.put (name,email);
                }
            }input = scanner.nextLine ();
        }map.entrySet ()
                .stream ()
                .forEach (f -> System.out.printf ("%s -> %s%n",f.getKey (),f.getValue ()));
    }
}
