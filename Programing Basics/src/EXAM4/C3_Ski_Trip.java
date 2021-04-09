package EXAM4;

import java.util.Scanner;

public class C3_Ski_Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dni = Double.parseDouble(scanner.nextLine());
        String p = scanner.nextLine();
        String o = scanner.nextLine();
        double total = 0;
        double nosht = dni - 1;
        if (p.equals("room for one person")) {
            if (dni < 10) {
                total = nosht * 18;
            } else if (dni >= 10 && dni <= 15) {
                total = nosht * 18;
            } else if (dni > 15) {
                total = nosht * 18;
            }
        }
        if (p.equals("apartment")) {
            if (dni < 10) {
                total = nosht * 25;
                total = total - total * 0.30;
            } else if (dni >= 10 && dni <= 15) {
                total = nosht * 25;
                total = total - total * 0.35;
            } else if (dni > 15) {
                total = nosht * 25;
                total = total - total * 0.50;
            }
        }if(p.equals("president apartment")) {
            if (dni < 10) {
                total = nosht * 35;
                total = total - total * 0.10;
            } else if (dni >= 10 && dni <= 15) {
                total = nosht * 35;
                total = total - total * 0.15;
            } else if (dni > 15) {
                total = nosht * 35;
                total = total - total * 0.20;
            }
        }if(o.equals("positive") ){
            total = total + total * 0.25;
        }else if(o.equals("negative")){
            total = total - total * 0.10;
        }
        System.out.printf("%.2f",total);
    }
}
