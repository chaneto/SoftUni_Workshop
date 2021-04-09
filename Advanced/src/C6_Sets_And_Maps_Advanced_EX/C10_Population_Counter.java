package C6_Sets_And_Maps_Advanced_EX;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C10_Population_Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Double> mapcountry = new LinkedHashMap<> ();
        Map<String,Map<String,Double>> maptown = new LinkedHashMap<> ();
        while (true){
            String[] input = scanner.nextLine ().split ("[|]");
            if(input[0].equals ("report")){
                break;
            }String country = input[1];
            String town = input[0];
            Double people = Double.parseDouble (input[2]);
            if(!mapcountry.containsKey (country)){
                mapcountry.put (country,people);
                maptown.put (country,new LinkedHashMap<> ());
                maptown.get (country).put (town,people);
            }else {
                if(!maptown.get (country).containsKey (town)){
                    maptown.get (country).put (town,people);
                    double sum = mapcountry.get (country);
                    sum += people;
                    mapcountry.put (country,sum);
                }
            }
        }mapcountry.entrySet ()
                .stream ()
                .sorted ((s1,s2) -> s2.getValue ().compareTo (s1.getValue ()))
                .forEach (f -> {
                    System.out.printf ("%s (total population: %.0f)%n",f.getKey (),f.getValue ());
                    maptown.get (f.getKey ()).entrySet ()
                            .stream ()
                            .sorted ((s1,s2) -> s2.getValue ().compareTo (s1.getValue ()))
                            .forEach (m -> System.out.printf ("=>%s: %.0f%n",m.getKey (),m.getValue ()));
                });

    }
}
