package ATECHMODUL.Method_Ex;

import java.util.Scanner;

public class C2_Glasni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split("");
        Glasni(p);
    }public static void Glasni(String [] p){
        int counter = 0;
        for (int i = 0; i < p.length; i++) {
            if(p[i].equals("a") || p[i].equals("u") || p[i].equals("i") || p[i].equals("e")|| p[i].equals("o")||p[i].equals("q")
             || p[i].equals("A")||p[i].equals("U")||p[i].equals("I")||p[i].equals("E")||p[i].equals("O")||p[i].equals("Q")){
                counter++;

            }

        }
        System.out.println(counter);

    }
}
