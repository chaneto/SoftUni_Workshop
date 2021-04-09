package C13_Generics.C1_Jar_of_T;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Jar<Integer> jar = new Jar<> ();
        jar.add (7);
        jar.add (4);
        jar.add (9);


        Jar<String> jar1 = new Jar<> ();
        jar1.add ("som");
        jar1.add ("sharan");
        jar1.add ("shtuka");
        System.out.println (jar.remove ());
        System.out.println (jar1.remove ());

    }
}
