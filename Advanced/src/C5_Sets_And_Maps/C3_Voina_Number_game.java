package C5_Sets_And_Maps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class C3_Voina_Number_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Set<Integer> first = new LinkedHashSet<> ();
        Set<Integer> second = new LinkedHashSet<> ();
        int[] a = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
        for (int i = 0; i < a.length; i++) {
            first.add (a[i]);
        }
        int[] b = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
        for (int i = 0; i < b.length; i++) {
            second.add (b[i]);
        }int count = 0;
        while (true) {
            count++;
            if (count == 50) {
                break;
            }int one = 0;
            int two = 0;
            for (Integer out : first) {
                one = out;
                first.remove (out);
                break;
            }for(Integer out : second){
                two = out;
                second.remove (out);
                break;
            }if(one > two){
                first.add (one);
                first.add (two);
            }
            else if(two > one){
                second.add (one);
                second.add (two);
            }else {
                first.remove (one);
                second.remove (two);
            }
            if(first.isEmpty () || second.isEmpty ()){
                break;
            }
        }if(first.size () > second.size ()){
            System.out.println ("First player win!");
        }else if (second.size () > first.size ()){
            System.out.println ("Second player win!");
        }else {
            System.out.println ("Draw!");
        }
    }
}
