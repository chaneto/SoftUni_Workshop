package EXAM3;

import java.util.Scanner;

public class C3_WeddingIn_Vestment {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String years = scanner.nextLine();
            String vertrag = scanner.nextLine();
            String desert = scanner.nextLine();
            double broimesec = Double.parseDouble(scanner.nextLine());
            double price = 0;
            if(years.equals("one")){
                if(vertrag.equals("Small")){
                    price = 9.98;
                }else if(vertrag.equals("Middle")){
                    price = 18.99;
                }else if(vertrag.equals("Large")){
                    price = 25.98;
                }else if(vertrag.equals("ExtraLarge")){
                    price = 35.99;
                }
            } if(years.equals("two")) {
                if (vertrag.equals("Small")) {
                    price = 8.58;
                } else if (vertrag.equals("Middle")) {
                    price = 17.09;
                } else if (vertrag.equals("Large")) {
                    price = 23.59;
                } else if (vertrag.equals("ExtraLarge")) {
                    price = 31.79;
                }
            }if(desert.equals("yes")){
                if(price <= 10){
                    price += 5.50;
                }else if(price <= 30){
                    price += 4.35;
                }else if(price > 30){
                    price += 3.85;
                }
            }if(years.equals("two")){
                price = price - price * 0.0375;
            }price = price * broimesec;
            System.out.printf("%.2f lv.",price);
        }
    }

