package C5_Sets_And_Maps;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class C2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Set<String> vip = new TreeSet<> ();
        Set<String> normal = new TreeSet<> ();
        while (true){
            String input = scanner.nextLine ();
            if(input.equals ("PARTY")){
                break;
            }Character firstsimbol = input.charAt (0);
            if(Character.isDigit (firstsimbol)){
                vip.add (input);
            }else {
                normal.add (input);
            }
        }
        while (true){
            String p = scanner.nextLine ();
            if(p.equals ("END")){
                break;
            }Character firstsimbol = p.charAt (0);
            if(Character.isDigit (firstsimbol)){
                vip.remove (p);
            }else {
                normal.remove (p);
            }
        }
        System.out.println (vip.size () + normal.size ());
        for(String out : vip){
            System.out.println (out);
        }
        for(String out : normal){
            System.out.println (out);
        }
    }
}
