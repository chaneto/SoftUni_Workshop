package C6_Sets_And_Maps_Advanced_EX;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C6_Miner_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine ();
        Map<String,Integer> map = new LinkedHashMap<> ();
        int counter = -1;
        String name = "";
        while (!input.equals ("stop")){
            counter++;
            if(counter %2 == 0){
                name = input;
            }else {
                if(!map.containsKey (name)){
                    map.put (name,Integer.parseInt (input));
                }else {
                    int sum = map.get (name);
                    sum += Integer.parseInt (input);
                    map.put (name,sum);
                }
            }
            input = scanner.nextLine ();
        }map.entrySet ()
                .stream ()
                .forEach (f -> System.out.printf ("%s -> %d%n",f.getKey (),f.getValue ()));
    }
}
