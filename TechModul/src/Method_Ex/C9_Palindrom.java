package ATECHMODUL.Method_Ex;

import java.util.Scanner;

public class C9_Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        M(scanner);

    }public static String M (Scanner scanner){
        String p = scanner.nextLine();
        int counter = 0;
        String m = "";
        String m1 = "";
        int t = p.length();
        while (!p.equals("END")){
            for (int i = 0; i < p.length()/2; i++) {
                m += p.charAt(i);
                m1 +=p.charAt(t - 1);
                if(m.equals(m1)){
                    counter++;
                }t--;
            }if(counter == p.length()/2){
                System.out.println("true");
            }else {
                System.out.println("false");
            }counter = 0;
            m = "";
            m1 = "";
            p = scanner.nextLine();
            t = p.length();
        }return p;
    }
}
