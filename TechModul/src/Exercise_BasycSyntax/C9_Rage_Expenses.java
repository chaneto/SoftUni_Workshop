package ATECHMODUL.Exercise_BasycSyntax;

import java.util.Scanner;

public class C9_Rage_Expenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double losesgames = Double.parseDouble(scanner.nextLine());
        double headsetprice = Double.parseDouble(scanner.nextLine());
        double mouseprice = Double.parseDouble(scanner.nextLine());
        double kayboardprice = Double.parseDouble(scanner.nextLine());
        double displayprice = Double.parseDouble(scanner.nextLine());
         headsetprice = headsetprice *  Math.floor(losesgames / 2);
         mouseprice = mouseprice *  Math.floor(losesgames / 3);
        kayboardprice = kayboardprice *  Math.floor(losesgames / 6);
        displayprice = displayprice * Math.floor(losesgames / 12) ;
        double total = headsetprice + mouseprice + kayboardprice + displayprice;
        System.out.printf("Rage expenses: %.2f lv.",total);

    }
}
