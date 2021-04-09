package EXAM1;

import java.util.Scanner;

public class C5_Fan_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budjet = Integer.parseInt(scanner.nextLine());
        int broi = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < broi ; i++) {
            String p = scanner.nextLine();
            counter++;
            if(p.equals("hoodie")){
                sum += 30;
            }else if(p.equals("keychain")){
                sum +=  4;
            }else if (p.equals("T-shirt")){
                sum += 20;
            }else if(p.equals("flag")){
                sum += 15;
            }else if (p.equals("sticker")){
                sum += 1;
            }



        } if(budjet >= sum){
            System.out.printf("You bought %d items and left with %d lv.",counter,budjet - sum);
        }else{
            System.out.printf("Not enough money, you need %d more lv.",sum - budjet);
        }


    }
}
