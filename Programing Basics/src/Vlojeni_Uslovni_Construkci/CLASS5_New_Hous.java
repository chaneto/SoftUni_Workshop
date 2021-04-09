package Vlojeni_Uslovni_Construkci;

import java.util.Scanner;

public class CLASS5_New_Hous {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        double broi = Double.parseDouble(scanner.nextLine());
        double budjet = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        if(p.equals("Roses")){
            sum = broi * 5;
        }else if(p.equals("Dahlias")){
            sum = broi * 3.80;
        }else if(p.equals("Tulips")){
            sum = broi * 2.80;
        }else if(p.equals("Narcissus")){
            sum = broi * 3.00;
        }else if(p.equals("Gladiolus")){
            sum = broi * 2.50;
        }if(broi > 80 && p.equals("Roses")){
            sum -= sum * 0.10;
        }if(broi > 90 && p.equals("Dahlias")){
            sum -= sum * 0.15;
        }if(broi > 80 && p.equals("Tulips")){
            sum -= sum * 0.15;
        }if(broi < 120 && p.equals("Narcissus")){
            sum += sum * 0.15;
        }if(broi < 80 && p.equals("Gladiolus")){
            sum += sum * 0.20;
        }if(budjet >= sum ){
            System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.",broi,p,budjet - sum);
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.",sum - budjet);
        }

            }



        }

