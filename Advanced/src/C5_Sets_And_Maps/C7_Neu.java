package C5_Sets_And_Maps;

import java.util.*;

public class C7_Neu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = Integer.parseInt (scanner.nextLine ());
        Map<String, Map<String,Deque<String>>> map = new LinkedHashMap<> ();
        for (int i = 0; i < number; i++) {
            String [] input = scanner.nextLine ().split (" ");
            String continent = input[0];
            String country = input[1];
            String town = input[2];
            if(!map.containsKey (continent)){
                map.put (continent,new LinkedHashMap<> ());
                map.get (continent).put (country,new ArrayDeque<> ());
                map.get (continent).get (country).offer (town);
            }else {
                if(!map.get (continent).containsKey (country)){
                    map.get (continent).put (country,new ArrayDeque<> ());
                    map.get (continent).get (country).offer (town);
                }else {
                    map.get (continent).get (country).offer (town);
                    System.out.println ();
                }
            }
        }map.entrySet ()
                .stream ()
                .forEach (f -> {
                    System.out.printf ("%s:%n",f.getKey ());
                    f.getValue ().entrySet ()
                            .stream ()
                            .forEach (s -> {
                                System.out.printf ("%s -> ",s.getKey ());
                                while (!map.get (f.getKey ()).get (s.getKey ()).isEmpty ()){
                                    if(f.getValue ().get (s.getKey ()).size () < 2){
                                        System.out.printf("%s",s.getValue ().poll ());
                                    }else {
                                        System.out.printf("%s, ",s.getValue ().poll ());
                                    }
                                }
                                System.out.println ();
                            });
                });
    }
}
