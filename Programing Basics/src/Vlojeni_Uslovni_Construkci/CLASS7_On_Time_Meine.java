








package Vlojeni_Uslovni_Construkci;

import java.util.Scanner;

public class CLASS7_On_Time_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hhi = Integer.parseInt(scanner.nextLine());
        int mmi = Integer.parseInt(scanner.nextLine());
        int hhp = Integer.parseInt(scanner.nextLine());
        int mmp = Integer.parseInt(scanner.nextLine());
        int hhpr = hhp*60;
        int hhir = hhi*60;
        int totalp = hhpr + mmp;
        int totali = hhir + mmi;
        int total = 0;
        int hh = 0;
        int mm = 0;
        if(totalp>totali){
            total = totalp - totali;
            if(total<60){
                System.out.println("Late");
                System.out.printf("%d minutes after the start.",total);
            }else if (total>=60){
                hh =total / 60;
                mm = total % 60;
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start.", hh,mm);
            }

        }if(totali>=totalp){
            total = totali - totalp;
            if (total == 0){
                System.out.println("On time");
            }else if(total <= 30){
                System.out.println("On time");
                System.out.printf("%d minutes before the start.",totali-totalp);
            }else if(total>30&&total<60){
                System.out.println("Early");
                System.out.printf("%d minutes before the start,",totali-totalp);
            }else if(total>=60){
                hh = total/60;
                mm = total%60;
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start.",hh,mm);
            }
        }


    }

}









