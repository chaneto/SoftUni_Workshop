package C4_Encapsulation_Ex.C3_Shopping_Spre;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] persons = scanner.nextLine ().split (";");
        String[] products = scanner.nextLine ().split (";");
        Map<String, Person> mapPersons = new LinkedHashMap<> ();
        Map<String, Product> mapProducts = new LinkedHashMap<> ();
        for (int i = 0; i < persons.length; i++) {
            String[] current = persons[i].split ("=");
            try {
                Person person = new Person (current[0],Double.parseDouble (current[1]));
                mapPersons.putIfAbsent (person.getName (),person);
            }catch (IllegalArgumentException e){
                System.out.println (e.getMessage ());
            }
        }
        for (int i = 0; i < products.length; i++) {
            String[] current = products[i].split ("=");
            try {
                Product product = new Product (current[0],Double.parseDouble (current[1]));
                mapProducts.putIfAbsent (product.getName (),product);
            }catch (IllegalArgumentException e){
                System.out.println (e.getMessage ());
            }
        }if(mapPersons.isEmpty ()){
            return;
        }else if(mapProducts.isEmpty ()){
            for(Map.Entry<String,Person> out : mapPersons.entrySet ()){
                System.out.printf ("%s – Nothing bought",out.getKey ());
            }return;
        }
        while (true){
            String[] p = scanner.nextLine ().split (" ");
            String name = p[0];
            if(name.equals ("END")){break;}
            String product = p[1];
            try {
                mapPersons.get (name).buyProduct (mapProducts.get (product));
                System.out.printf ("%s bought %s%n",name,product);

            }catch (IllegalArgumentException e){
                System.out.println (e.getMessage ());
                return;
            }
        }
        for(Map.Entry<String, Person> out : mapPersons.entrySet ()){
            System.out.println (out.getValue ().toString ());
        }

    }
}
