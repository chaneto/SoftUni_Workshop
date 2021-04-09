package EXAM3;

import java.util.Scanner;

public class C4_Bachelor_Party {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = Integer.parseInt(scanner.nextLine());
            int counter = 0;
            int price = 0;
            int total = 0;
            while (true){
                String p = scanner.nextLine();
                if(p.equals("The restaurant is full"))break;
                int b = Integer.parseInt(p);
                counter += b;
                if(b < 5){
                    price = b * 100;

                }if(b >= 5){
                    price = b * 70;

                }total += price;
            }if(total >= a){
                System.out.printf("You have %d guests and %d leva left.",counter,total - a);
            }else if(a > total){
                System.out.printf("You have %d guests and %d leva income, but no singer.",counter,total);
            }
        }
    }

