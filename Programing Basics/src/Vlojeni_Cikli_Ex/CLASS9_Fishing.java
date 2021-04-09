package Vlojeni_Cikli_Ex;

import java.util.Scanner;

public class CLASS9_Fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double broiribi = Double.parseDouble(scanner.nextLine());
        double counter = 0;
        double counter3 = 0;
        double asciisum = 0;
        double sumfish = 0;
        double total = 0;

        for (int i = 1; i <= broiribi ; i++) {
            String riba = scanner.nextLine();
            if(riba.equals("Stop"))
                break;
                else{
            double kg = Double.parseDouble(scanner.nextLine());
            counter++;
            counter3++;
                for (int j = 0; j <riba.length() ; j++) {
                    asciisum += riba.charAt(j);
                }sumfish = asciisum/kg;
                if(counter3 == 3){
                    total += sumfish;
                    counter3 = 0;
                }else {
                    total -= sumfish;
                }asciisum = 0;

                if(counter == broiribi){
                    System.out.println("Lyubo fulfilled the quota!");break;
                }

                }



        }if(total > 0){
            System.out.printf("Lyubo's profit from %.0f fishes is %.2f leva.",counter, total);
        }if(total < 0){
            System.out.printf("Lyubo lost %.2f leva today.",Math.abs(total));
        }

    }
}
