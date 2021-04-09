package Vlojeni_Cikli;

import java.util.Scanner;

public class CLASS7_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        int asciisum = 0;
        int simbol = 0;
        int win = 0;
        String w = "";
        while (!(p.equals("STOP"))){
            for (int i = 0; i < p.length() ; i++) {
                simbol += p.charAt(i);
                if(simbol > win){
                    win = simbol;
                    w = p;
                }
            }simbol = 0;
            p = scanner.nextLine();

        }
        System.out.printf("Winner is %s - %d!",w,win );
    }
}
