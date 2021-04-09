package C6_Sets_And_Maps_Advanced_EX;

import java.util.*;

public class C11_Logs_Aggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt (scanner.nextLine ());
        Map<String, Set<String>>  mapIP = new TreeMap<> ();
        Map<String,Integer> maptime = new TreeMap<> ();
        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine ().split (" ");
            String name = input[1];
            String IP = input[0];
            int time = Integer.parseInt (input[2]);
            if(!mapIP.containsKey (name)){
                maptime.put (name,time);
                mapIP.put (name,new TreeSet<> ());
                mapIP.get (name).add (IP);
            }else {
                int sum = maptime.get (name);
                sum += time;
                maptime.put (name,sum);
                mapIP.get (name).add (IP);

            }
        }maptime.entrySet ()
                .stream ()
                .forEach (f -> {
                    System.out.printf ("%s: %d [",f.getKey (),f.getValue ());
                    int counter = mapIP.get (f.getKey ()).size ();
                    for(String out : mapIP.get (f.getKey ())){
                        counter--;
                        if(counter > 0){
                            System.out.printf ("%s, ",out);
                        }else {
                            System.out.printf ("%s]",out);
                        }

                    }
                    System.out.println ();
                });
    }
}
