package EXAM3;

import java.util.Scanner;

public class C4_Wedding_Decoration {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double budjet = Double.parseDouble(scanner.nextLine());
            double price = 0;
            double total = 0;
            double b = 0;
            double f = 0;
            double c = 0;
            double r = 0;
            while(budjet > total){
                String p = scanner.nextLine();
                if(p.equals("stop")){
                    System.out.printf("Spend money: %.2f%n",total);
                    System.out.printf("Money left: %.2f%n",budjet - total);
                    System.out.printf("Purchased decoration is %.0f balloons, %.0f m ribbon," +
                            " %.0f flowers and %.0f candles.",b,r,f,c);break;
                }
                int broi = Integer.parseInt(scanner.nextLine());

                if(p.equals("balloons")){
                    b += broi;
                    price = broi * 0.10;
                }if (p.equals("flowers")){
                    f += broi;
                    price = broi * 1.5;
                }if (p.equals("candles")){
                    c += broi;
                    price = broi * 0.5;
                }if (p.equals("ribbon")){
                    r += broi;
                    price = broi * 2;
                }total += price;
                if(total >= budjet){
                    System.out.println("All money is spent!");
                    System.out.printf("Purchased decoration is %.0f balloons, %.0f m ribbon," +
                            " %.0f flowers and %.0f candles.",b,r,f,c);
                }
            }

        }

    }

