package C14_Generics_EX.C6_Generic_Count_Method_Doubles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int size = Integer.parseInt (scanner.nextLine ());
        Counter_Double<Double> counter = new Counter_Double<> ();
        for (int i = 0; i < size; i++) {
            Double input = Double.parseDouble (scanner.nextLine ());
            counter.add (input);
        }
        double a = Double.parseDouble (scanner.nextLine ());
        System.out.println (counter.count (a));
    }
}
