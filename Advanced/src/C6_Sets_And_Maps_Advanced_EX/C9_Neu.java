package C6_Sets_And_Maps_Advanced_EX;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C9_Neu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Map<String, Map<String,Integer>> map = new TreeMap<> ();
        while (true) {
            String[] input = scanner.nextLine ().split (" ");
            if(input[0].equals ("end")){
                break;
            }
            int index = input[0].indexOf ("=");
            String IP = input[0].substring (index + 1);
            index = input[2].indexOf ("=");
            String user = input[2].substring (index + 1);
            if(!map.containsKey (user)){
                map.put (user,new LinkedHashMap<> ());
                map.get (user).put (IP,1);
            }else {
                if(!map.get (user).containsKey (IP)){
                    map.get (user).put (IP,1);
                }else {
                    int counter = map.get (user).get (IP);
                    counter++;
                    map.get (user).put (IP,counter);
                }
            }
        }map.entrySet ()
                .stream ()
                .forEach (f -> {
                    System.out.println (f.getKey () + ":");
                    int counter = f.getValue ().size ();
                    for(Map.Entry<String,Integer> out : f.getValue ().entrySet ()){
                        counter--;
                        if(counter > 0){
                            System.out.printf ("%s => %d, ",out.getKey (),out.getValue ());
                        }else {
                            System.out.printf ("%s => %d.%n",out.getKey (),out.getValue ());
                        }
                    }
                });
    }
}
