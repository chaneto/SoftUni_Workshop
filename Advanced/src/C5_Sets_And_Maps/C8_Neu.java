package C5_Sets_And_Maps;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C8_Neu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = Integer.parseInt (scanner.nextLine ());
        Map<String,Double> map = new TreeMap<> ();
        String name = "";
        for (int i = 0; i < number * 2; i++) {
            String[] input = scanner.nextLine ().split (" ");
            if(i % 2 == 0){
                name = input[0];
            }else {
                int counter = input.length;
                double sum = 0;
                for (int j = 0; j < input.length; j++) {
                    sum += Double.parseDouble (input[j]);
                }sum = sum / counter;
                if(!map.containsKey (name)){
                    map.put (name,sum);
                }name = "";
            }
        }map.entrySet ()
                .stream ()
                .forEach (f -> {System.out.printf ("%s is graduated with ",f.getKey ());
                    DecimalFormat format = new DecimalFormat ("0.####################");
                    System.out.println (format.format (f.getValue ()));

                });
    }
}
