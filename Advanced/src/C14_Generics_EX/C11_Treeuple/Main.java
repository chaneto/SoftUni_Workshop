package C14_Generics_EX.C11_Treeuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] p = scanner.nextLine ().split (" ");
        Treeuple<String, String, String> treeuple1 = new Treeuple<> (p[0] + " " + p[1], p[2], p[3]);
        treeuple1.Print1();
        p = scanner.nextLine ().split (" ");
        boolean yes = false;
        if(p[2].equals ("drunk")){
            yes = true;
        }
        Treeuple<String, Integer, Boolean> treeuple2 = new Treeuple<> (p[0], Integer.parseInt (p[1]), yes);
        treeuple2.Print2 ();

        p = scanner.nextLine ().split (" ");
        Treeuple<String, Double, String> treeuple3 = new Treeuple<> (p[0], Double.parseDouble (p[1]), p[2]);
        System.out.printf ("%s -> %.1f -> %s",treeuple3.getItem1 (),treeuple3.getItem2 (),treeuple3.getItem3 ());
    }
}
