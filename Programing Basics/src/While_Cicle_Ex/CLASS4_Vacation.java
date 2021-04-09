package While_Cicle_Ex;

import java.util.Scanner;

public class CLASS4_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneytravel = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int spendcounter = 0;
        int counter = 0;
        double totalmoney = 0;
        while(true){
            String p = scanner.nextLine();
            double daysmoney = Double.parseDouble(scanner.nextLine());
            counter++;
            if(p.equals("spend")){
                spendcounter++;
                money=money-daysmoney;
                if(money<0){money=0;}
            }if(p.equals("save")){
                spendcounter=0;
                money= money+daysmoney;
            }if(spendcounter==5){
                System.out.println("You can't save the money.");
                System.out.println(counter);break;
            }if(money>=moneytravel){
                System.out.printf("You saved the money for %d days.",counter);break;
            }
        }

    }
}
