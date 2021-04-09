package EXAM4;

import java.util.Scanner;

public class C4_Pupycare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kg = Integer.parseInt(scanner.nextLine());
        int gr = kg * 1000;
        int total = 0;
        while (true){
            String p = scanner.nextLine();
            if(p.equals("Adopted"))break;
            int grden = Integer.parseInt(p);
            total += grden;

        }if(gr >= total){
            System.out.printf("Food is enough! Leftovers: %d grams.",gr - total );
        }else {
            System.out.printf(	"Food is not enough. You need %d grams more.",total - gr );
        }
    }
}
