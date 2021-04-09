package EXAM3;

import java.util.Scanner;

public class C3_Honey_Moon {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double budjet = Double.parseDouble(scanner.nextLine());
            String city = scanner.nextLine();
            double broinight = Double.parseDouble(scanner.nextLine());
            double ticket = 0;
            double total = 0;
            if(city.equals("Cairo")){
                 total = broinight *(250 * 2) + 600;
                if(broinight <=4){
                    total -= total * 0.03;
                }else if (broinight>=5 && broinight <=9){
                    total -= total * 0.05;
                }else if(broinight >= 10 && broinight <= 24){
                    total -= total * 0.10;
                }else if(broinight >= 25 && broinight <= 49){
                    total -= total * 0.17;
                }else if(broinight >= 50){
                    total -= total * 0.30;
                }

            }if(city.equals("Paris")){
                total = broinight * (150 * 2 ) + 350;
                 if (broinight>=5 && broinight <=9){
                    total -= total * 0.07;
                }else if(broinight >= 10 && broinight <= 24){
                    total -= total * 0.12;
                }else if(broinight >= 25 && broinight <= 49){
                    total -= total * 0.22;
                }else if(broinight >= 50) {
                     total -= total * 0.30;
                 }
            }if(city.equals("Lima")) {
                total = broinight * (400 * 2) + 850;
                if (broinight >= 25 && broinight <= 49) {
                    total -= total * 0.19;
                } else if (broinight >= 50) {
                    total -= total * 0.30;
                }
            }if(city.equals("New York")) {
                total = broinight * (300 * 2) + 650;
                if (broinight <= 4) {
                    total -= total * 0.03;
                } else if (broinight >= 5 && broinight <= 9) {
                    total -= total * 0.05;
                } else if (broinight >= 10 && broinight <= 24) {
                    total -= total * 0.12;
                } else if (broinight >= 25 && broinight <= 49) {
                    total -= total * 0.19;
                } else if (broinight >= 50) {
                    total -= total * 0.30;
                }

            }if(city.equals("Tokyo")) {
                total = broinight * (350 * 2) + 700;
                if (broinight <= 4) {
                    total = total + 0;
                } else if (broinight >= 5 && broinight <= 9) {
                    total = total + 0;
                } else if (broinight >= 10 && broinight <= 24) {
                    total -= total * 0.12;
                } else if (broinight >= 25 && broinight <= 49) {
                    total -= total * 0.17;
                } else if (broinight >= 50) {
                    total -= total * 0.30;
                }
            }
            if(budjet > total ){
                System.out.printf("Yes! You have %.2f leva left.",budjet - total);
            }else {
                System.out.printf("Not enough money! You need %.2f leva.",total - budjet);
            }
        }
    }

