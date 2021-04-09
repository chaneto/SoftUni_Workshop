package Uslovni_Konstrukcii_Ex;

import java.util.Scanner;

public class CLASS8_Dance_Hall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double broistapki = Double.parseDouble(scanner.nextLine());
        double broitanciori = Double.parseDouble(scanner.nextLine());
        double dnizauchene = Double.parseDouble(scanner.nextLine());
        double total = broistapki/dnizauchene;
        double tt =(total/broistapki);
        double tp =Math.ceil( tt*100);
        double t = tp/broitanciori;
        if(tp<=13){
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.",t);
        }else{
            System.out.printf("No, they will not succeed in that goal! Required %.2f%% steps to be learned per day.",t);
        }

    }
}
