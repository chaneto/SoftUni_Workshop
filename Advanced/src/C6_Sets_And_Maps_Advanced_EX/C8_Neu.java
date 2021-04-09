package C6_Sets_And_Maps_Advanced_EX;

import java.util.*;


public class C8_Neu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Map<String,Set<String>> map = new LinkedHashMap<> ();
        while (true){
            String input = scanner.nextLine ();
            if(input.equals ("JOKER")){
                break;
            }
            int index = input.indexOf (":");
            String name = input.substring (0,index);
            String coloda = input.substring (index + 2);
            String [] cardname = coloda.split (", ");
            if(!map.containsKey (name)){
                map.put (name,new HashSet<> ());
                for (int i = 0; i < cardname.length; i++) {
                    String card = cardname[i];
                    map.get (name).add (card);
                }
            }else {
                for (int i = 0; i < cardname.length; i++) {
                    map.get (name).add (cardname[i]);
                }
            }
        }map.entrySet ()
                .stream ()
                .forEach (f -> {
                    System.out.print (f.getKey () + ": ");
                    int sum = 0;
                    for(String out : f.getValue ()){
                        String einz = "";
                        String zwei = "";
                        if(out.length () == 3){
                            einz = out.substring (0,2);
                            zwei = out.substring (2);
                        }else {
                            einz += out.charAt (0);
                            zwei += out.charAt (1);
                        }
                        int one = 0;
                        int two = 0;
                        int sumcard = 0;

                        if(einz.equals ("J")){
                            one = 11;
                        }
                        else if (einz.equals ("Q")){
                            one = 12;
                        }
                        else if(einz.equals ("K")){
                            one = 13;
                        }
                        else if(einz.equals ("A")){
                            one = 14;
                        }
                        else {
                            one = Integer.parseInt (einz);
                        }
                        if(zwei.equals ("C")){
                            two = 1;
                        }
                        else if(zwei.equals ("D")){
                            two = 2;
                        }
                        else if(zwei.equals ("H")){
                            two = 3;
                        }
                        else if(zwei.equals ("S")){
                            two = 4;
                        }sumcard = one * two;
                        sum += sumcard;

                    }
                    System.out.println (sum);
                });
    }
}
