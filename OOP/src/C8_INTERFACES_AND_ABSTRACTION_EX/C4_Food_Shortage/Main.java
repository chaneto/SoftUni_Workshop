package C8_INTERFACES_AND_ABSTRACTION_EX.C4_Food_Shortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Map<String,Buyer> buyerMap = new HashMap<> ();
        int nummer = Integer.parseInt (scanner.nextLine ());
        for (int i = 0; i < nummer; i++) {
            String[] input = scanner.nextLine ().split (" ");
            Buyer buyer = null;
            if(input.length == 4){
                buyer = new Citizen (input[0], Integer.parseInt (input[1]), input[2], input[3]);
            }else {
                buyer = new Rebel (input[0], Integer.parseInt (input[1]), input[2]);
            }buyerMap.putIfAbsent (input[0],buyer);
        }while (true){
        String name = scanner.nextLine ();
        if(name.equals ("End")){break;}
        if(buyerMap.containsKey (name)){
            buyerMap.get (name).buyFood ();
           }
        }int sum = 0;
        for(Map.Entry<String,Buyer> out : buyerMap.entrySet ()){
            sum += out.getValue ().getFood ();

        }
        System.out.println (sum);
    }
}
