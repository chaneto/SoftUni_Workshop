package Vlojeni_Cikli_Ex;

import java.util.Scanner;

public class CLASS9_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double counter = 0;
        double counter3 = 0;
        double asciisum = 0;
        double sum = 0;
        double total = 0;
        while (a > counter){
            String p = scanner.nextLine();
            if(p.equals("Stop")){break;}

            double kg = Double.parseDouble(scanner.nextLine());
            counter++;
            counter3++;
            for (int i = 0; i < p.length() ; i++) {
                asciisum += p.charAt(i);
            }sum = asciisum / kg;
            if(counter3 == 3){
                total += sum;
                counter3 = 0;
            }else {
                total -= sum;
            }asciisum = 0;
        }if(counter == a){
            System.out.println("Lyubo fulfilled the quota!");
        }if(total > 0){
            System.out.printf("Lyubo's profit from %.0f fishes is %.2f leva.",counter,total);
        }if(total < 0){
            System.out.printf("Lyubo lost %.2f leva today.",Math.abs(total));
        }
    }
}
