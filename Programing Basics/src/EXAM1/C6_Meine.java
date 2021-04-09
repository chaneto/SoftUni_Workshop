package EXAM1;

import java.util.Scanner;

public class C6_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        int winer = 0;
        String w = "";
        while (!(p.equals("END"))){
            int a = Integer.parseInt(scanner.nextLine());

            if(a > winer){
                winer = a;
                w = p;
                if(a >= 10){break;}
            }
            p = scanner.nextLine();

        }

        System.out.printf("%s is the best player!%n",w);
        if(winer >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n",winer);
        }else{
            System.out.printf( "He has scored %d goals.",winer);
        }
    }
}
