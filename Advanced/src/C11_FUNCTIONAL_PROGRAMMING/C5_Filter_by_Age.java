package C11_FUNCTIONAL_PROGRAMMING;

import java.util.Scanner;
import java.util.function.Function;

public class C5_Filter_by_Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = Integer.parseInt (scanner.nextLine ());
        String[] person = new String[a];
        for (int i = 0; i < a; i++) {
            String p = scanner.nextLine ();
            person[i] = p;
        }
        String criteria = scanner.nextLine ();
        int acriteriaage = Integer.parseInt (scanner.nextLine ());
        String[] p = scanner.nextLine ().split (" ");
        for (int i = 0; i < person.length; i++) {
            if(criteria.equals ("older")){
                String[] out = person[i].split (", ");
                if(Integer.parseInt (out[1]) >= acriteriaage){
                    if(p.length > 1){
                        System.out.printf ("%s - %d%n",out[0],Integer.parseInt (out[1]));
                }else {
                        if (p[0].equals ("name")) {
                            System.out.printf ("%s%n", out[0]);
                        } else {
                            System.out.printf ("%s%n", out[1]);
                        }
                    }
                }
            }else {
                String[] out = person[i].split (", ");
                if(Integer.parseInt (out[1]) <= acriteriaage){
                    if(p.length > 1){
                        System.out.printf ("%s - %d%n",out[0],Integer.parseInt (out[1]));
                    }else {
                        if (p[0].equals ("name")) {
                            System.out.printf ("%s%n", out[0]);
                        } else {
                            System.out.printf ("%s%n", out[1]);
                        }
                    }
                }
            }
        }
    }
}
