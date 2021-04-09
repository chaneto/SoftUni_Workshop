package C14_Generics_EX.C10_Tuple;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
                String[] input = scanner.nextLine ().split (" ");
                Tuple<String, String> tuple1 = new Tuple<> (input[0] + " " + input[1], input[2]);
                tuple1.Print ();
                input = scanner.nextLine ().split (" ");
                Tuple<String, Integer> tuple2 = new Tuple<> (input[0], Integer.parseInt (input[1]));
                 tuple2.Print ();
                 input = scanner.nextLine ().split (" ");
                    Tuple<Integer, Double> tuple3 = new Tuple<> (Integer.parseInt (input[0]),
                            Double.parseDouble (input[1]));
                    tuple3.Print ();



    }
}
