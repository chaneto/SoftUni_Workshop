package C1_Abstraction.C4_Hotel_Reservation;

import java.util.Scanner;
enum Season{
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);
    private int seasonIndex;

    Season(int seasonIndex) {
        this.seasonIndex = seasonIndex;
    }
    public int grtPriceSeason(){
        return this.seasonIndex;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] input = scanner.nextLine ().split (" ");
        double price = Double.parseDouble (input[0]);
        int days = Integer.parseInt (input[1]);
        String season = input[2];
        String vip = input[3];
        Season season1 = Season.valueOf (season);
        Discount discount = Discount.valueOf (vip);
        System.out.printf ("%.2f",getprice (price, days, season1, discount ));

    }
    public static double getprice(double price, int days, Season season, Discount discount ){
        return price * days * season.grtPriceSeason () * discount.getRabat ();
    }
}
