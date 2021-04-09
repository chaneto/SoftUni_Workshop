package EXAM;

import java.util.Scanner;

public class TASK3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        double broisladkishi = Double.parseDouble(scanner.nextLine());
        double data = Double.parseDouble(scanner.nextLine());
        double total = 0;
        if(p.equals("Cake")){
            if(data <= 15){
                total = broisladkishi * 24;
            }else{
                total = broisladkishi * 28.70;
            }
        } if(p.equals("Souffle")){
            if(data <= 15){
                total = broisladkishi * 6.66;
            }else{
                total = broisladkishi * 9.80;
            }
        } if(p.equals("Baklava")){
            if(data <= 15){
                total = broisladkishi * 12.60;
            }else{
                total = broisladkishi * 16.98;
            }
        }if(data <= 22 && total >=100 && total <=200 ){
            total = total - total * 0.15;
        }if(data <= 22 && total > 200 ){
            total = total - total * 0.25;
        }if(data <= 15){
            total = total - total * 0.10;
        }
        System.out.printf("%.2f",total);
    }
}
