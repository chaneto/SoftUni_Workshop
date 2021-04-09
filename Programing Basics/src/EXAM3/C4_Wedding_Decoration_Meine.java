package EXAM3;

import java.util.Scanner;

public class C4_Wedding_Decoration_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budjet = Double.parseDouble(scanner.nextLine());
        double total = 0;
        double baloni = 0;
        double flowers = 0;
        double candels = 0;
        double ribbon = 0;
        while (budjet > total){
            String p = scanner.nextLine();
            if(p.equals("stop")){break;}
            double broi = Double.parseDouble(scanner.nextLine());
            if(p.equals("balloons")){
                baloni += broi;
            }if(p.equals("flowers")){
                flowers += broi;
            }if(p.equals("candles")){
                candels += broi;
            }if(p.equals("ribbon")){
                ribbon += broi;
            }total = baloni * 0.1 + flowers * 1.5 + candels * 0.5 + ribbon * 2;

        }
        if(total < budjet){
            System.out.printf("Spend money: %.2f%n",total);
            System.out.printf("Money left: %.2f%n",budjet - total);
        }else {
            System.out.printf("All money is spent!%n");
        }
        System.out.printf("Purchased decoration is %.0f balloons, %.0f m ribbon," +
                " %.0f flowers and %.0f candles.",baloni,ribbon,flowers,candels);
    }
}
